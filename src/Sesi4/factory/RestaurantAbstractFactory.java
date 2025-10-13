package Sesi4.factory;

import Sesi4.model.Drink;
import Sesi4.model.MainCourse;

public abstract class RestaurantAbstractFactory {
    public abstract MainCourse createMainCourse();

    public abstract Drink createDrink();
}
