package ru.mirea.pkmn;

import java.io.Serializable;

public class AttackSkill implements Serializable {
    private String name;
    private String description;
    private String cost;
    private int damage;
    private static final long serialVersionUID = 1L;

    public AttackSkill(String name, String description, String cost, int damage) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.damage = damage;
    }
    @Override
    public String toString() {
        return "AttackSkill{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                ", damage=" + damage +
                '}';
    }
}
