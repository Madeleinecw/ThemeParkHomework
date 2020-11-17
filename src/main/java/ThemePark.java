import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.reviewed = new ArrayList<IReviewed>();

    }

    public ArrayList getAllReviewed(){
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visitAttraction(attraction);
        attraction.addToVisitCount();
    }
}
