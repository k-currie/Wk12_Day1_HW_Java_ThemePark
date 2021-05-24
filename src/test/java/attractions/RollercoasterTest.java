package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 1.5, 40.0);
        visitor2 = new Visitor(13, 1.2, 40.0);
        visitor3 = new Visitor(16, 1.7, 40.0);
        visitor4 = new Visitor(19, 2.1, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void willNotAdmitPersonUnder12() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void willNotAdmitPersonUnder145cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void willAdmitPersonOver12AndOver145cm() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasStartingFee() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void willChargeDoubleFeeToPeopleOver2m() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.0);
    }

    @Test
    public void willChargeStandardFeeToPeople2mAndUnder() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.0);
    }

}
