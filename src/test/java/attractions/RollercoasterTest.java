package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    private ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor = new Visitor(27, 210, 200, visitedAttractions);
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
    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.getPrice(), 0);
    }

    @Test
    public void doubleThePrice() {
        assertEquals(16.8, rollerCoaster.priceFor(visitor),0);
    }
}
