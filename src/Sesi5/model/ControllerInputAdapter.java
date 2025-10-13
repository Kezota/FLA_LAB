package Sesi5.model;

public class ControllerInputAdapter extends KeyboardInput {
    private ControllerInput controllerInput;

    public ControllerInputAdapter(ControllerInput controllerInput) {
        super(convert(controllerInput.getInput()));
        this.controllerInput = controllerInput;
    }

    private static String convert(String input) {
        switch (input.toLowerCase()) {
            case "analog up":
                return "W";
            case "analog down":
                return "S";
            case "analog left":
                return "A";
            case "analog right":
                return "D";
            default:
                return "INVALID";
        }
    }
}
