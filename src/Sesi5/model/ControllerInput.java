package Sesi5.model;

public class ControllerInput {
    private String input;

    public ControllerInput(String input) {
        if (input.equalsIgnoreCase("analog up") || input.equalsIgnoreCase("analog down") ||
            input.equalsIgnoreCase("analog left") || input.equalsIgnoreCase("analog right")) {
            this.input = input;
        } else {
            this.input = "INVALID";
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        if (input.equalsIgnoreCase("analog up") || input.equalsIgnoreCase("analog down") ||
            input.equalsIgnoreCase("analog left") || input.equalsIgnoreCase("analog right")) {
            this.input = input;
        } else {
            this.input = "INVALID";
        }
    }
}
