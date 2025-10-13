package Sesi4.factory;

import Sesi4.model.Drink;
import Sesi4.model.MainCourse;
import Sesi4.model.Ocha;
import Sesi4.model.Sushi;

public class JapaneseFactory extends RestaurantAbstractFactory {
    @Override
    public MainCourse createMainCourse() {
        System.out.println("Creating Japanese Main Course: Sushi");
        return new Sushi();
    }

    @Override
    public Drink createDrink() {
        System.out.println("Creating Japanese Drink: Ocha");
        return new Ocha();
    }
}
