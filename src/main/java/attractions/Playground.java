package attractions;

import apple.laf.JRSUIConstants;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int maxAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maxAge = 15;
    }

    public int maxAge() {
        return maxAge;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>maxAge){
            return false;}
        else{
            return true;
        }
    }

}
