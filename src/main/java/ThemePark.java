import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark{

    private ArrayList <IReviewed> places;
    private String name;

    public ThemePark(String name) {
        this.name = name;
        places = new ArrayList<>();
    }

    public int getRating() {
        return this.getRating();
    }

    public String getName() {
        return this.getName();
    }

    public int getAllReviewed() {
        return places.size();
    }

    public void review(IReviewed place) {
        places.add(place);
    }
}
