package Sesi5;

import Sesi5.model.ControllerInput;
import Sesi5.model.ControllerInputAdapter;
import Sesi5.model.KeyboardInput;
import Sesi5.model.KeyboardReader;
import Sesi5.type2Adapter.PriceAdapter;

public class Main {
//    public Main() {
//        int price_USD = 10;
//        PriceAdapter priceAdapter = new PriceAdapter();
//
//        System.out.println("in IDR: Rp" + priceAdapter.USDToIDR(price_USD));
//    }

    public Main() {
        KeyboardReader reader = new KeyboardReader();

        KeyboardInput input1 = new KeyboardInput("w");
        KeyboardInput input2 = new KeyboardInput("A");
        KeyboardInput input3 = new KeyboardInput("S");
        KeyboardInput input4 = new KeyboardInput("D");
        KeyboardInput input5 = new KeyboardInput("F");

        ControllerInput cInput1 = new ControllerInput("analog up");
        ControllerInput cInput2 = new ControllerInput("analog down");
        ControllerInput cInput3 = new ControllerInput("analog left");
        ControllerInput cInput4 = new ControllerInput("analog right");
        ControllerInput cInput5 = new ControllerInput("analog center");

        ControllerInputAdapter controllerAdapter = new ControllerInputAdapter(cInput1);
        reader.readMovement(controllerAdapter);

//        reader.readMovement(input1);
//        reader.readMovement(input2);
//        reader.readMovement(input3);
//        reader.readMovement(input4);
//        reader.readMovement(input5);
    }

    public static void main(String[] args) {
        new Main();
    }
}
