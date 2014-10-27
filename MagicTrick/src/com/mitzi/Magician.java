package com.mitzi;

import java.util.Random;

public class Magician {
    private Card[][] orderedDeck;
    private Card[][] shuffledDeck;
    private Card[] firstRow = new Card[4];
    private Card[] secondRow = new Card[4];

    public Magician() {
        orderedDeck = initDeck();
        shuffledDeck = initShuffledDeck();
    }

    public Card findCard(int orderedRow, int shuffledRow){
        for (int i = 0; i < 4; i++) {
            firstRow[i] = orderedDeck[orderedRow-1][i];
            secondRow[i] = shuffledDeck[shuffledRow-1][i];
        }
        Card duplicated = null;
        int duplicatesCount=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(firstRow[i].equals(secondRow[j])){
                    duplicated = firstRow[i];
                    duplicatesCount++;
                }
            }
        }
        if(duplicatesCount>1){
            return null;
        }
        return duplicated;
    }

    public void showOrderedDeck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print(orderedDeck[i][j].getCardInt() + " ");
            }
            System.out.println();
        }
    }

    public Card[][] initDeck(){
        Card[][] deck = new Card[4][4];
        int cardNumber=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                deck[i][j] = new Card(cardNumber);
                cardNumber++;
            }
        }
        return deck;
    }

    public Card[][] initShuffledDeck(){
        Card[][] deck = initDeck();
        Random rnd = new Random();
        int indexI, indexJ;
        Card swap;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                indexI = rnd.nextInt(i+1);
                indexJ = rnd.nextInt(j+1);
                swap = deck[indexI][indexJ];
                deck[indexI][indexJ] = deck[i][j];
                deck[i][j] = swap;
            }
        }
        return deck;
    }

    public void showShuffledDeck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(shuffledDeck[i][j].getCardInt() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "A magician never reveals his secrets";
    }
}
