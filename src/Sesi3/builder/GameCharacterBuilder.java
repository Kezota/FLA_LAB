package Sesi3.builder;

import Sesi3.model.GameCharacter;

public class GameCharacterBuilder {
    private String name;
    private int hp;
    private int baseDmg;
    private String role;
    private String weapon;

    public GameCharacterBuilder addName(String name) {
        this.name = name;
        return this;
    }

    public GameCharacterBuilder addHp(int hp) {
        this.hp = hp;
        return this;
    }

    public GameCharacterBuilder addBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
        return this;
    }

    public GameCharacterBuilder addRole(String role) {
        this.role = role;
        return this;
    }

    public GameCharacterBuilder addWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    // old way
//    public void addName(String name) {
//        this.name = name;
//    }
//
//    public void addHp(int hp) {
//        this.hp = hp;
//    }
//
//    public void addBaseDmg(int baseDmg) {
//        this.baseDmg = baseDmg;
//    }
//
//    public void addRole(String role) {
//        this.role = role;
//    }
//
//    public void addWeapon(String weapon) {
//        this.weapon = weapon;
//    }

    public GameCharacter build() {
        return new GameCharacter(name, hp, baseDmg, role, weapon);
    }
}
