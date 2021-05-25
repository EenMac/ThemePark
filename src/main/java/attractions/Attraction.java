package attractions;

import behaviours.IReviewed;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed {
    private String name;
    private int rating;
    private int visitCount;
    ArrayList<Attraction>attractions;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public int getAttractionsCount(){
        return attractions.size();
    }
}
