package com.mitzi;

public class Card {
    private int cardInt;

    public Card(int cardInt) {
        this.cardInt = cardInt;
    }

    public int getCardInt() {
        return cardInt;
    }

    public void setCardInt(int cardInt) {
        this.cardInt = cardInt;
    }

    @Override
    public String toString() {
        return String.valueOf(cardInt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (cardInt != card.cardInt) return false;

        return true;
    }
}
