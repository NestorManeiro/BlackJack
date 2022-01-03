package Cards;

public class Figures extends Card{

    protected String figure;
    
    public Figures(String figure) {
        super(10);
        this.figure = figure;
    }

    @Override
    public String toString() {
        return figure;
    }
    
}
