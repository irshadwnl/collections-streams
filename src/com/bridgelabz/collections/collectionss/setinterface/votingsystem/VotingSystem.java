package com.bridgelabz.collections.collectionss.setinterface.votingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>(); // Candidate -> Votes
    private Map<String, Integer> linkedVoteMap = new LinkedHashMap<>(); // Maintain vote order
    private TreeMap<String, Integer> sortedVoteMap; // Sorted results

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        linkedVoteMap.put(candidate, linkedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResultsSorted() {
        sortedVoteMap = new TreeMap<>(voteMap); // Sorts by candidate name
        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    public void displayResultsInOrder() {
        System.out.println("\nVoting Results (In Order of Votes Cast):");
        for (Map.Entry<String, Integer> entry : linkedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    public String getWinner() {
        return Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Alice");
        system.castVote("Bob");

        system.displayResultsSorted();
        system.displayResultsInOrder();

        System.out.println("\nWinner: " + system.getWinner());
    }
}

