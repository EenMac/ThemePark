package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    private ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor = new Visitor(7, 120, 10, visitedAttractions);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getPrice() {
        assertEquals(4.50, dodgems.getPrice(), 0);
    }

    @Test
    public void halfPrice() {
        assertEquals(2.25, dodgems.priceFor(visitor),0);
    }
}
