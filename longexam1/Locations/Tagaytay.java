package Locations;

import Tourists.Tourist;

public class Tagaytay implements Locations {

    public int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}