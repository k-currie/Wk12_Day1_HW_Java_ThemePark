package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private Double minHeight;
    private int minAge;
    private Double startingPrice;


    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.minAge = 12;
        this.minHeight = 1.45;
        this.startingPrice = 8.40;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()> minAge && visitor.getHeight()> minHeight){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 2.0){
            return defaultPrice() * 2;}
        else{
        return defaultPrice();
    }
}

}
