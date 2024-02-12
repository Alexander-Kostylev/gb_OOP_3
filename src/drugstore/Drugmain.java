package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        PharmacyTwo p1 = new PharmacyTwo("medicament1");
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo("medicament2");
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo("medicament3");
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();

        List<PharmacyTwo> medicament = new ArrayList<>();

        medicament.add(p1);
        medicament.add(p2);
        medicament.add(p3);

//        System.out.println(p1.getFullPower());

//        for (PharmacyTwo c: medicament){
//            System.out.println(c);
//        }
        System.out.println(medicament);

        Collections.sort(medicament);

        System.out.println(medicament);

        Collections.sort(medicament, Comparator.reverseOrder());

        System.out.println(medicament);


//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//
//        System.out.println(components);
//
//        Collections.sort(components,Comparator.reverseOrder());
//        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

    }
}
