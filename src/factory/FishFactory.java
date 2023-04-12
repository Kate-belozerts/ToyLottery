package factory;

import toys.CrazyFish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FishFactory extends ToysFactory {
    private static final int BOX_WITH_WATER_ML = 20;

    public static List<CrazyFish> createFish(int count) {
        List<CrazyFish> fishList = new ArrayList<>();
        if (count > 0 && count <= getMaxCount()) {
            int id = 50;
            for (int i = 0; i < count; i++) {
                fishList.add(new CrazyFish(id, "fishka", new Random().nextInt(1, 10)));
                id++;
            }
        } else System.out.println("Измените количество для производства");
        return fishList;
    }
}
