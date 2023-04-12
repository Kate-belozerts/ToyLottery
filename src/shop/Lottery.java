package shop;

import toys.CrazyFish;
import toys.EmptyToy;
import toys.FluffyDog;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Lottery {
    private static Lottery lottery;
    private final Queue<String> prizeToys;
    private int frequencyDog;
    private int frequencyFish;

    private Lottery(int frequencyDog) {
        this.frequencyDog = frequencyDog;
        this.frequencyFish = 100 - this.frequencyDog;
        this.prizeToys = new LinkedList<>();
    }

    public static Lottery startLottery(int frequency) {
        if (lottery == null) {
            lottery = new Lottery(frequency);
        }
        return lottery;
    }

    public void changeFrequencyDog(int num) {
        this.frequencyDog = num;
        this.frequencyFish = 100 - this.frequencyDog;
    }

    public void lotteryIn(List<FluffyDog> boxOne, List<CrazyFish> boxTwo) {
        int result = new Random().nextInt(100);

        if (this.frequencyDog > this.frequencyFish) {
            if (result < this.frequencyFish) {
                this.prizeToys.offer(String.valueOf(boxTwo.remove(0)));
            } else this.prizeToys.offer(String.valueOf(boxOne.remove(0)));
        } else {
            if (result < this.frequencyDog) {
                this.prizeToys.offer(String.valueOf(boxOne.remove(0)));
            } else this.prizeToys.offer(String.valueOf(boxTwo.remove(0)));
        }
    }

    public String lotteryOut() {
        if (prizeToys.size() > 0) {
            return prizeToys.poll();
        } else return new EmptyToy().toString();
    }

    @Override
    public String toString() {
        return "Lottery box has: " + prizeToys +
                ", frequencyDog - " + frequencyDog +
                ", frequencyFish - " + frequencyFish;
    }
}
