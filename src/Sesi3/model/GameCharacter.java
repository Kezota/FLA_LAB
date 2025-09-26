package Sesi3.model;

public class GameCharacter implements Cloneable {
    private String name;
    private int hp;
    private int baseDmg;
    private String role;
    private String weapon;

    public GameCharacter(String name, int hp, int baseDmg, String role, String weapon) {
        this.name = name;
        this.hp = hp;
        this.baseDmg = baseDmg;
        this.role = role;
        this.weapon = weapon;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


//    @Override
//    public GameCharacter clone() throws CloneNotSupportedException {
//        return new GameCharacter(this.name, this.hp, this.baseDmg, this.role, this.weapon);
//    }

    public void print() {
        System.out.println("Name: " + name + ", HP: " + hp + ", Base Damage: " + baseDmg + ", Role: " + role + ", Weapon: " + weapon);
    }

    public void takeDamage(int dmg) {
        this.hp -= dmg;
        if (this.hp < 0) this.hp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
