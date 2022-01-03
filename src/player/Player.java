package Player;


import Cards.Card;
import java.util.ArrayList;

public class Player {
    
    private final String name;
    
    private final ArrayList<Card> cards;

    public Player(String name) {
        this.cards = new ArrayList();
        this.name = name;
    }
    
    public void addCard(Card card){
        cards.add(card);
    }

    @Override
    public String toString() {
        String player = name + " : ";
        int value = 0;
        int aces = 0;
        for (Card card : cards) {
            player+=card.toString() +" ";
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
        player += "(" + value;
        if(cards.size()==2 && value == 21){
            player+= ", BlackJack";
        }
        player+=")";
        
        return player;
    }    

    public ArrayList<Card> getCards() {
        return cards;
    }
    
}
