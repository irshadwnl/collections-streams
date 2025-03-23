package com.bridgelabz.collections.collectionss.setinterface.insurancepolicymngmnt;

public class InsurancePolicy {
    private int policyNumber;
    private String policyHolderName;
    private String expiryDate;
    private int premiumAmmount;

    public InsurancePolicy(int policyNumber, String policyHolderName, String expiryDate, int premiumAmmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.premiumAmmount = premiumAmmount;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public int getPremiumAmmount() {
        return premiumAmmount;
    }


}
