import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<IReviewed> attractions;
    Attraction attraction;
    Visitor visitor1;
    Dodgems dodgems;


    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(11, 1.5, 40.0);
    }

}
