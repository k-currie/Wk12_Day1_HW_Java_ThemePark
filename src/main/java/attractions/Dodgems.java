package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.startingPrice = 4.50;
    }


    @Override
    public double defaultPrice() {
        return startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
          return defaultPrice()/2;
        }
        else {
            return defaultPrice();
        }
    }
}
