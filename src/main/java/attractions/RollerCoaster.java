package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = 8.40;

    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 || visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()> 200){
            return defaultPrice() * 2;
        }else{
            return defaultPrice();
        }
    }
}
