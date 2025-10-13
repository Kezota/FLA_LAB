package Sesi5.model;

public class KeyboardReader {
    public void readMovement(KeyboardInput input) {
        if (input.getInput().equalsIgnoreCase("W")) {
            System.out.println("Move Up");
        } else if (input.getInput().equalsIgnoreCase("A")) {
            System.out.println("Move Left");
        } else if (input.getInput().equalsIgnoreCase("S")) {
            System.out.println("Move Down");
        } else if (input.getInput().equalsIgnoreCase("D")) {
            System.out.println("Move Right");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
