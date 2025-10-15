package LatihanQuiz.singleton;

import LatihanQuiz.model.Cake;

import java.util.ArrayList;

public class Database {
    private static Database instance;
    private ArrayList<Cake> cakes;

    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        cakes = new ArrayList<Cake>();
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public ArrayList<Cake> getCakes() {
        return cakes;
    }
}
