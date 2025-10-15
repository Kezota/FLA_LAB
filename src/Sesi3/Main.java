package Sesi3;

import Sesi3.builder.GameCharacterBuilder;
import Sesi3.model.GameCharacter;

public class Main {
    public Main() {
        // traditional way
//        GameCharacter char1 = new GameCharacter("Archer", 100, 15, "Ranged", "Bow");
//        char1.print();

        // builder way (old)
//        GameCharacterBuilder builder = new GameCharacterBuilder();
//        builder.addName("Warrior");
//        builder.addHp(150);
//        builder.addBaseDmg(25);
//        builder.addRole("Melee");
//
//        GameCharacter char2 = builder.build();
//        char2.print();

        // builder with chaining
        GameCharacter char3 = new GameCharacterBuilder()
                .addName("Mage")
                .addHp(80)
                .addBaseDmg(30)
                .addRole("Magic")
                .addWeapon("Staff")
                .build();
//        char3.print();

        // builder as a template
//        GameCharacterBuilder builder = new GameCharacterBuilder()
//                .addName("Mage")
//                .addHp(80)
//                .addBaseDmg(30)
//                .addRole("Magic")
//                .addWeapon("Staff");
//
//        GameCharacter char4 = builder.addName("Wizard").build();
//        char4.print();

        // Prototype -> cloning
//        GameCharacter char5 = null;
        GameCharacter char5 = null;
        try {
            char5 = (GameCharacter) char3.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        char3.print();
        char5.print();
        char3.takeDamage(10);
        char3.print();
        char5.print();
    }

    public static void main(String[] args) {
        new Main();
    }
}