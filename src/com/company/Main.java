package com.company;

public class Main {

    public static void main(String[] args) {
        int shitalAge = 18, minimumVotingAgeInIndia = 18;
        int komalAge = 19;
        int votingAgeInAnotherCountry = minimumVotingAgeInIndia + 1;

        System.out.println("Minimum voting age in India " + minimumVotingAgeInIndia);

        printVotingQaulifcation("Shital", shitalAge, minimumVotingAgeInIndia);
        printVotingQaulifcation("Komal", komalAge, votingAgeInAnotherCountry);
    }

    static void printVotingQaulifcation(String name, int personAge, int votingAge) {
        String positiveStatement = " is Qualified for voting";
        String negativeStatement = "is not qualified for voting";
        if (personAge >= votingAge) {
            System.out.println(name + positiveStatement);
        } else {
            System.out.println(name + negativeStatement);
        }
    }
}
