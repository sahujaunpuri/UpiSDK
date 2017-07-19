package com.upi.sdk.processflow.bankAccount;

import android.os.Handler;
import android.os.Looper;

import com.rssoftware.upiint.schema.Cred;
import com.rssoftware.upiint.schema.Error;
import com.rssoftware.upiint.schema.ReqRegMobile;
import com.rssoftware.upiint.schema.State;
import com.upi.sdk.core.UpiSDKContext;
import com.upi.sdk.errors.SDKErrorCodes;
import com.upi.sdk.processflow.ProcessChain;
import com.upi.sdk.processflow.ProcessSubflow;
import com.upi.sdk.services.ServiceCallback;
import com.upi.sdk.services.WebServiceStatus;

import java.util.List;

/**
 * Created by SwapanP on 27-04-2016.
 */
public class RegMobCredentialCaptureAuthSubflow implements ProcessSubflow {
    private Handler handler = new Handler(Looper.getMainLooper());

    @Override
    public void execute(final Object o, final ProcessChain chain) {
        final ReqRegMobile request = (ReqRegMobile) o;
        if (request.getiStateListener() != null)
            request.getiStateListener().getState(State.IDLE);

        handler.post(new Runnable() {
            @Override
            public void run() {
                UpiSDKContext.getInstance().getCommonLibrary().getCredentialRegMob(request,
                        new ServiceCallback<Cred[]>(Cred[].class) {

                            @Override
                            public void onSuccess(Cred[] result) {
                                for (int i = 0; i < result.length; i++) {
                                    request.getCreds().add(result[i]);
                                }

                                chain.doNext(o);
                            }

                            @Override
                            public void onError(WebServiceStatus status, List<Error> errors) {
                                if (request.getiStateListener() != null)
                                    request.getiStateListener().getState(State.ACTIVE);
                                if (errors != null && errors.size() > 0) {
                                    chain.breakChain(errors.get(0).getErrorCode(), null);
                                } else {
                                    chain.breakChain(SDKErrorCodes.ERR00000.name(), null);
                                }
                            }
                        });
            }
        });


    }
}
