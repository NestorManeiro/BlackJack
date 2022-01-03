package blackjack;

import Cards.Ace;
import Cards.Card;
import Cards.Figures;
import Cards.PipCard;
import Player.Player;
import java.util.ArrayList;

public class InitCards {
        
        static Player p1 = new Player("Player1");
        static Player p2 = new Player("Player2");
        static Player p3 = new Player("Player3");
        static Player cruoupier = new Player("Cruopier");
        static ArrayList<Card> deck = new ArrayList<Card>(4);
            
        static Figures J = new Figures("J");
        static Figures Q = new Figures("Q");
        static Figures K = new Figures("K");
        
        static Ace A = new Ace();
        
        static PipCard dos = new PipCard(2);
        static PipCard tres = new PipCard(3);
        static PipCard cuatro = new PipCard(4);
        static PipCard cinco = new PipCard(5);
        static PipCard seis = new PipCard(6);
        static PipCard siete = new PipCard(7);
        static PipCard ocho = new PipCard(8);
        static PipCard nueve = new PipCard(9);
        static PipCard diez = new PipCard(10);
    
        public static void reiniciar(){
            p1 = new Player("Player1");
            p2 = new Player("Player2");
            p3 = new Player("Player3");
            cruoupier = new Player("Cruopier");
            deck = new ArrayList<>(4);
        }
}
