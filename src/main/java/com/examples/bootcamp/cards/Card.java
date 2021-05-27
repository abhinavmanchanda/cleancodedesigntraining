package com.examples.bootcamp.cards;

public class Card implements Comparable<Card>{
    private Rank rank;
    private Suite suite;


    @Override
    public int compareTo(Card other) {
        if(rank == other.rank) return suite.compareTo(other.suite);
        return rank.compareTo(other.rank);
    }
}
