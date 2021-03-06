package com.upi.sdk.processflow.beneficiary;

import com.rssoftware.upiint.schema.BeneficiaryDetails;
import com.upi.sdk.converters.Converters;
import com.upi.sdk.domain.InputBeneficiary;
import com.upi.sdk.errors.ConversionException;
import com.upi.sdk.errors.SDKErrorCodes;
import com.upi.sdk.processflow.ProcessChain;
import com.upi.sdk.processflow.ProcessSubflow;

/**
 * Created by NeeloyG on 5/19/2016.
 */
public class AddBeneficiaryConverterSubflow implements ProcessSubflow {

    @Override
    public void execute(Object o, final ProcessChain chain) {

        InputBeneficiary input = (InputBeneficiary)o;
        BeneficiaryDetails beneficiaryDetails = null;

        try {
            beneficiaryDetails = Converters.getConverter(InputBeneficiary.class, BeneficiaryDetails.class).convert(input);
        } catch (ConversionException e) {
            chain.breakChain(e.getErrorCode().name(),null);
        }

        if (beneficiaryDetails == null)
            chain.breakChain(SDKErrorCodes.ERR00098.name(),null);
        else
            chain.doNext(beneficiaryDetails);
    }
}
