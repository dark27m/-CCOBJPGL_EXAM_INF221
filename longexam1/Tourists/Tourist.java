package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Canada;
import Locations.Davao;
import Locations.Australia;
import Locations.Tagaytay;
import Locations.Japan;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Canada canada);
    
    void visit(Davao davao);

    void visit(Australia australia);

    void visit(Tagaytay tagaytay);

    void visit(Japan japan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}