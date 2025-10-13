package Sesi4.factory;

import Sesi4.model.Drink;
import Sesi4.model.MainCourse;
import Sesi4.model.Pasta;
import Sesi4.model.Wine;

public class ItalianFactory extends RestaurantAbstractFactory {
    @Override
    public MainCourse createMainCourse() {
        return new Pasta();
    }

    @Override
    public Drink createDrink() {
        return new Wine();
    }
}
