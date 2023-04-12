package factory;

import toys.FluffyDog;

import java.util.ArrayList;
import java.util.List;

public class DogFactory extends ToysFactory {
    public static List<FluffyDog> createDog(int count) {
        List<FluffyDog> fluffyDogs = new ArrayList<>();
        if (count > 0 && count <= getMaxCount()) {
            int id = 20;
            for (int i = 0; i < count; i++) {
                fluffyDogs.add(new FluffyDog(id, "SnoopDoggyDog", 15));
                id++;
            }
        } else System.out.println(" Введите другое допустимое количество для производства");
        return fluffyDogs;
    }
}
