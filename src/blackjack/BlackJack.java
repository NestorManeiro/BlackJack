package Blackjack;

import Cards.Card;
import java.util.ArrayList;

public class BlackJack {

    public BlackJack() {
    }
    
    public ArrayList<String> getWinners(ArrayList<Card> player1, ArrayList<Card> player2, ArrayList<Card> player3,ArrayList<Card> croupier, ArrayList<Card> deck){
        
        ArrayList<String> winners = new ArrayList();
        
        BlackJack game = new BlackJack();
        int mostvalue=game.CalculateValue(croupier,deck);
        
        if(game.isBlackJack(croupier,deck)) winners.add("Croupier");
        if (winners.size()>0) return winners;
        
        if(game.isBlackJack(player1,deck)) winners.add("Player1");
        if(game.isBlackJack(player2,deck)) winners.add("Player2");
        if(game.isBlackJack(player3,deck)) winners.add("Player3");
        if (winners.size()>0) return winners;
        
        if(game.CalculateValue(player1,deck) >= mostvalue  && game.CalculateValue(player1,deck) <= 21){
            winners.add("Player1");
            if(game.CalculateValue(player1,deck) > mostvalue) winners.removeAll(winners);
            mostvalue=game.CalculateValue(player1,deck);
        }
        
        if(game.CalculateValue(player2,deck) > mostvalue && game.CalculateValue(player2,deck) <= 21){
            winners.add("Player2");
            if(game.CalculateValue(player1,deck) >= mostvalue) winners.removeAll(winners);
            mostvalue=game.CalculateValue(player1,deck);
        }
        
        if(game.CalculateValue(player3,deck) > mostvalue && game.CalculateValue(player3,deck) <= 21){
            winners.add("Player3");
            if(game.CalculateValue(player1,deck) > mostvalue) winners.removeAll(winners);
            mostvalue=game.CalculateValue(player1,deck);
        }
                
        return winners;
    }
    
    public boolean isBlackJack(ArrayList<Card> player,ArrayList<Card> deck){
        if(player.size() == 2){
            if(CalculateValue(player,deck) == 21){
                return true;
            }
        }
        return false;
    }
    
    public int CalculateValue(ArrayList<Card> player, ArrayList<Card> deck){
        int aces = 0;
        int value = 0;
        
        for (Card card : player) {
            if(card.getValue()!=11){
                value+= card.getValue();
            } else {
                aces+=1;
            }
        }
        while(aces>0){
            if(value+11<=21) value+=11;
            else value+=1;
            aces-=1;
        }
        
        for (Card card : deck) {
            if(card.getValue()==11 && value<11){
                value+= card.getValue();
            } else if(1+value<21) {
                value+=1;
            }
            if(card.getValue()+value<21){
                value+=card.getValue();
            }
        }
                
        return value;
    }     
}
