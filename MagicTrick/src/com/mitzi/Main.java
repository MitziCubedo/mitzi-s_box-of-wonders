package com.mitzi;

import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        Magician magician = new Magician();

        System.out.println("Enter any string to continue...");
        String easterEgg = input.nextLine();
        if(easterEgg.equals("magician.toString();")){
            System.err.println(magician.toString());
        }

        System.out.println("Select a card... and tell me the row");
        magician.showOrderedDeck();
        int firstRow = input.nextInt();

        System.out.println("Let me shuffle the deck...");
        magician.showShuffledDeck();
        System.out.println("Now tell me in which row your card is now...");
        int secondRow = input.nextInt();

        Card card = magician.findCard(firstRow, secondRow);
        if(card==null){
            System.out.println("Bad magician!");
        }else{
            System.out.println("Your card is: "+card);
            //Aquí te falta la de "Volunteer Cheated!" 
        }
    }
}
