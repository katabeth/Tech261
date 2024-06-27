package com.sparta.kch;

public enum DnDClasses {
    BARBARIAN(0,"","STR CON", 12),
    BARD(),
    CLERIC,
    DRUID,
    FIGHTER,
    PALADIN,
    RANGER,
    ROGUE,
    SORCERER,
    WARLOCK,
    WIZARD;

    private int currentLevel;
    private String description;
    private String savingThrows;
    private int hitDie;

    DnDClasses(int currentLevel, String description, String savingThrows, int hitDie) {
        this.currentLevel = currentLevel;
        this.description = description;
        this.savingThrows = savingThrows;
        this.hitDie = hitDie;
    }
}
