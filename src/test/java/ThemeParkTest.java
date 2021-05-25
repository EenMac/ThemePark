import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

   ThemePark themePark;
   Dodgems dodgems;
   Park park;
   Playground playground;
   RollerCoaster rollerCoaster;
   CandyflossStall candyflossStall;
   IceCreamStall iceCreamStall;
   ParkingSpot parkingSpot;
   TobaccoStall tobaccoStall;
   ArrayList<ThemePark> places;

    @Before
    public void ThemePark(){
        themePark = new ThemePark("CarnivalCity");
        dodgems = new Dodgems("dodgems", 7, dodgems.defaultPrice());
        park = new Park("Pollock", 8);
        playground = new Playground("kiddy fun", 2);
        rollerCoaster = new RollerCoaster("Anaconda", 9, rollerCoaster.defaultPrice());
        candyflossStall = new CandyflossStall("Floss toss", "Bob", parkingSpot);
        iceCreamStall = new IceCreamStall("iceland", "Jim", parkingSpot);
        tobaccoStall = new TobaccoStall("Puff puff", "Stacy", parkingSpot);
    }

    @Test
    public void getListCount() {
        themePark.review(dodgems);
        assertEquals(1, themePark.getAllReviewed());
    }
}
