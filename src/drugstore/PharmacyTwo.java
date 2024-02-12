package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component>, Comparable<PharmacyTwo> {

    private List<Component> components = new ArrayList<>();

    private int index = 0;

    private String nameMedicament;

//    private int fullPower = getFullPower();

    public List<Component> getComponents() {
        return components;
    }

    private int getFullPower() {
        int sum = 0;
        for (Component c : components) {
            sum += c.getPower();
        }
        return sum;
    }

    public PharmacyTwo(String name) {
        this.nameMedicament = name;
    }


    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(PharmacyTwo o) {
        if (this.getFullPower() > o.getFullPower()) {
            return 1;
        } else if (this.getFullPower() < o.getFullPower()) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return this.nameMedicament +
                "; fullPower =" + getFullPower();
    }
}

