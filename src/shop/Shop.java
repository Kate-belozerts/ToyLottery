package shop;

import toys.CrazyFish;
import toys.FluffyDog;
import toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends Toy> {
    private static final int MAX_COUNT = 20;
    protected final List<FluffyDog> dogShop;
    protected final List<CrazyFish> fishShop;

    public Shop(List<FluffyDog> dogShop, List<CrazyFish> fishShop) {
        this.dogShop = new ArrayList<>(dogShop);
        this.fishShop = new ArrayList<>(fishShop);
    }

    public void addToShop(T toy) {
        if (toy instanceof FluffyDog && getCountDod() <= getMaxCount()) {
            this.dogShop.add((FluffyDog) toy);
        } else if (toy instanceof CrazyFish && getCountFish() <= getMaxCount()) {
            this.fishShop.add((CrazyFish) toy);
        }
    }

    public int getCountDod() {
        return this.dogShop.size();
    }

    public int getCountFish() {
        return this.fishShop.size();
    }

    public int getMaxCount() {
        return MAX_COUNT;
    }

    public List<FluffyDog> getDogShop() {
        return dogShop;
    }

    public List<CrazyFish> getFishShop() {
        return fishShop;
    }

    @Override
    public String toString() {
        return "Shop contains: \n" + this.dogShop + this.fishShop + '\n';
    }
}
