package com.bridgelabz.collections.collectionss.setinterface;

import java.util.*;

class Policy {
    String policyNumber;
    String policyHolder;
    Date expiryDate;

    public Policy(String policyNumber, String policyHolder, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}

public class InsurancePolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> linkedPolicyMap = new LinkedHashMap<>();
    private TreeMap<Date, Policy> sortedByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        linkedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon(int days) {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH, days);
        Date futureDate = cal.getTime();

        for (Map.Entry<Date, Policy> entry : sortedByExpiry.entrySet()) {
            if (entry.getKey().after(now) && entry.getKey().before(futureDate)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(policyHolder)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = sortedByExpiry.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(now)) {
                String policyNumber = entry.getValue().getPolicyNumber();
                policyMap.remove(policyNumber);
                linkedPolicyMap.remove(policyNumber);
                iterator.remove();
            }
        }
    }

    public void displayPolicies() {
        for (Policy policy : linkedPolicyMap.values()) {
            System.out.println("Policy No: " + policy.getPolicyNumber() +
                    ", Holder: " + policy.getPolicyHolder() +
                    ", Expiry: " + policy.getExpiryDate());
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 20);
        system.addPolicy(new Policy("P1001", "John Doe", cal.getTime()));

        cal.set(2025, Calendar.APRIL, 10);
        system.addPolicy(new Policy("P1002", "Jane Smith", cal.getTime()));

        cal.set(2025, Calendar.FEBRUARY, 28);
        system.addPolicy(new Policy("P1003", "Alice Johnson", cal.getTime()));

        System.out.println("All Policies:");
        system.displayPolicies();

        System.out.println("\nPolicies Expiring in Next 30 Days:");
        List<Policy> expiring = system.getPoliciesExpiringSoon(30);
        for (Policy policy : expiring) {
            System.out.println(policy.getPolicyNumber());
        }

        System.out.println("\nPolicies for Jane Smith:");
        List<Policy> janePolicies = system.getPoliciesByHolder("Jane Smith");
        for (Policy policy : janePolicies) {
            System.out.println(policy.getPolicyNumber());
        }

        System.out.println("\nRemoving Expired Policies...");
        system.removeExpiredPolicies();

        System.out.println("\nUpdated Policies:");
        system.displayPolicies();
    }
}

