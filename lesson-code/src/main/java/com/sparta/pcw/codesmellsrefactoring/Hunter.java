package com.sparta.pcw.codesmellsrefactoring;

public class Hunter extends Person {
    private Weapon weapon;

    public Hunter(String firstName, String lastName, Weapon weapon) {
        super(firstName, lastName);
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    } //If not used, why declared

    public String shootWeapon() {
        return String.format("Hunter %s shoots! %s", getFullName(), weapon.shoot());
    }

}
