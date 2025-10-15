package LatihanQuiz.view;

import LatihanQuiz.model.Cake;
import LatihanQuiz.util.Util;

import java.util.ArrayList;

public class AppView {
    public void displayMenu() {
        Util.clearScreen();

        System.out.println("Nom Nom Co.");
        System.out.println("1. Bake Confectionary");
        System.out.println("2. View Arrangement Package");
        System.out.println("3. Exit");
    }
}
