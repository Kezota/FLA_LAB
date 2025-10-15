package LatihanQuiz.controller;

import LatihanQuiz.factory.CakeAbstractFactory;
import LatihanQuiz.factory.CupcakeFactory;
import LatihanQuiz.factory.TartFactory;
import LatihanQuiz.model.Cake;
import LatihanQuiz.singleton.Database;
import LatihanQuiz.util.Prompt;
import LatihanQuiz.view.AppView;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    Scanner scan = new Scanner(System.in);
    AppView view = new AppView();
    Database db = Database.getInstance();

    public AppController() {
        startApp();
    }

    private void startApp() {
        int choice;

        do {
            view.displayMenu();

            choice = new Prompt(">> ")
                    .scanInt(new Prompt.IntConfig().setMin(1).setMax(3).setErrMsg("Please enter a number between 1 and 3"));

            actions(choice);
            System.out.print("\nPress enter to continue...");
            scan.nextLine();
        } while (choice != 3);
    }

    private void actions(int choice) {
        System.out.println();

        switch (choice) {
            case 1:
                bakeConfectionary();
                break;
            case 2:
                viewArrangementPackage();
                break;
            case 3:
                exitProgram();
                break;
            default:
                System.out.println("Invalid choice input!");
                break;
        }
    }

    private void bakeConfectionary() {
        String confType = new Prompt("Input confectionary type [Cupcake | Tart][case sensitive]: ")
                .scanString(new Prompt.StringConfig().setOptions("Cupcake", "Tart"));

        String confSoftness = new Prompt("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ")
                .scanString(new Prompt.StringConfig().setOptions("Fluffy", "Medium", "Hard"));

        String isAddTopping = new Prompt("Add topping? [Y | N][case sensitive]: ")
                .scanString(new Prompt.StringConfig().setOptions("Y", "N"));

        ArrayList<String> toppings = new ArrayList<>();
        if (isAddTopping.equals("Y")) {
            for (int i = 0; i < 3; i++) {
                toppings.add(new Prompt("Input topping " + (i + 1) + " [length between 1 - 10]: ")
                        .scanString(new Prompt.StringConfig().setMin(1).setMax(10)));
            }
        }

        double confPrice = new Prompt("Input confectionary price [10 - 50]: ")
                .scanInt(new Prompt.IntConfig().setMin(10).setMax(50));

        String paymentType = new Prompt("Input payment type [Cash | Transfer | Crypto][case sensitive]: ")
                .scanString(new Prompt.StringConfig().setOptions("Cash", "Transfer", "Crypto"));

        double newPrice;

        switch (paymentType) {
            case "Cash": newPrice = confPrice * 1;
            case "Transfer": newPrice = confPrice * 1.1;
            case "Crypto": newPrice = confPrice / 2;
            default: newPrice = confPrice;
        }

        Cake newCake = null;
        if (confType == "Cupcake") {
            CakeAbstractFactory cupcakeFactory = new CupcakeFactory(confSoftness, toppings, newPrice, paymentType);
            newCake = cupcakeFactory.createCake();
        } else {
            CakeAbstractFactory tartFactory = new TartFactory(confSoftness, toppings, newPrice, paymentType);
            newCake = tartFactory.createCake();
        }

        db.addCake(newCake);

        newCake.serve();
        System.out.println("Confectionary baked!");
    }

    private void viewArrangementPackage() {
        ArrayList<Cake> cakes = db.getCakes();

        if (cakes.isEmpty()) {
            System.out.println("No cakes available!");
            return;
        }

        for (Cake cake : cakes) {
//            cake.dispayInfo();
        }
    }

    private void exitProgram() {
        System.out.println("Exiting program...");
    }
}
