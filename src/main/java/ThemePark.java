import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> attractions;
    Attraction attraction;
    Visitor visitor;

    public ThemePark() {
        this.attractions = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return attractions;
    }

//    public void visit(Visitor visitor, Attraction attraction){



    }
}
