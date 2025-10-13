package Sesi4;

import Sesi4.factory.ItalianFactory;
import Sesi4.factory.JapaneseFactory;
import Sesi4.factory.RestaurantAbstractFactory;
import Sesi4.model.Drink;
import Sesi4.model.MainCourse;

public class Main {
    public Main() {
//        RestaurantAbstractFactory japaneseFactory = new JapaneseFactory();
//
//        MainCourse mainCourse = japaneseFactory.createMainCourse();
//        Drink drink = japaneseFactory.createDrink();
//
//        mainCourse.served();
//        drink.serve();

        // output:
//        Sushi is Served
//        Ocha is served

        RestaurantAbstractFactory japaneseFactory = new ItalianFactory();

        MainCourse mainCourse = japaneseFactory.createMainCourse();
        Drink drink = japaneseFactory.createDrink();

        mainCourse.served();
        drink.serve();

        // output:
//        Pasta is Served
//        Wine is served
    }

    public static void main(String[] args) {
        new Main();
    }
}
