package blackjack;

import java.util.ArrayList;

public class Main extends InitCards {
    public static void main(String[] args){
        System.out.println("## Casos ");
        case1();
        System.out.println("\n");
        
        InitCards.reiniciar();
        case2();
        System.out.println("\n");
    }
    
    private static void case1(){        
        p1.addCard(J);
        p1.addCard(A);
        
        p2.addCard(diez);
        p2.addCard(cinco);
        p2.addCard(seis);
        
        p3.addCard(tres);
        p3.addCard(seis);
        p3.addCard(A);
        p3.addCard(tres);
        p3.addCard(A);
        p3.addCard(K);
        
        cruoupier.addCard(nueve);
        cruoupier.addCard(siete);
        
        deck.add(cinco);
        deck.add(cuatro);
        deck.add(K);
        deck.add(dos);
        
        
        System.out.println("### Caso 1");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(cruoupier.toString());
        System.out.println("Deck: " + deck.toString());
        
        Blackjack.BlackJack game = new Blackjack.BlackJack();
        
        ArrayList<String> winners = game.getWinners(p1.getCards(), p2.getCards(), p3.getCards(), cruoupier.getCards(),deck);
        System.out.print("getWinners(...)---->");
        System.out.print(winners);
    }
    
    private static void case2(){
        p1.addCard(diez);
        p1.addCard(K);
        
        p2.addCard(diez);
        p2.addCard(dos);
        p2.addCard(seis);
        
        p3.addCard(ocho);
        p3.addCard(ocho);
        p3.addCard(cinco);
        
        cruoupier.addCard(cinco);
        cruoupier.addCard(diez);
        
        deck.add(A);
        deck.add(tres);
        deck.add(K);
        deck.add(dos);
        
        
        System.out.println("### Caso 1");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(cruoupier.toString());
        System.out.println("Deck: " + deck.toString());
        
        Blackjack.BlackJack game = new Blackjack.BlackJack();
        
        ArrayList<String> winners = game.getWinners(p1.getCards(), p2.getCards(), p3.getCards(), cruoupier.getCards(),deck);
        System.out.print("getWinners(...)---->");
        System.out.print(winners); 
    }
}
