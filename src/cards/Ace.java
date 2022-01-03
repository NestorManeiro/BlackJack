package Cards;

public class Ace extends Card{
    
    public Ace() {
        super(11);
    }
    
    @Override
    public int getValue(){
        return 11;
    }
    
    @Override
    public String toString() {
        return "A";
    }    
    
}
