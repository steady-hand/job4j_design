package ru.job4j.generics;


public class Predator extends Animal {
    private final String area;

    public Predator(String habitat, String area) {
        super(habitat);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Predator{"
                + "area='" + area + '\''
                + '}';
    }
}
