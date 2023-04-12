package factory;

import askUser.AskUser;
import askUser.Menu;
import shop.Lottery;
import shop.Shop;
import toys.CrazyFish;
import toys.FluffyDog;
import toys.Toy;
import workWithFiles.SendToWinner;

import java.io.IOException;
import java.util.List;

public class StartFactory {

    public static void startFactory(int numA, int numB) throws IOException {
        List<FluffyDog> fluffyDogs = DogFactory.createDog(numA);
        List<CrazyFish> crazyFish = FishFactory.createFish(numB);

        Shop<Toy> allToys = new Shop<>(fluffyDogs, crazyFish);

        FluffyDog doggy = new FluffyDog(49, "dmx", 10);
        allToys.addToShop(doggy); //   <-- Возможность добавления игрушки

        int frequency = AskUser.Start();
        Lottery winner = Lottery.startLottery(frequency);

//        winner.changeFrequencyDog(30); //    <-- Возможность изменения % выпадения игрушки
        winner.lotteryIn(allToys.getDogShop(), allToys.getFishShop());
        winner.lotteryIn(allToys.getDogShop(), allToys.getFishShop());
        String result = winner.lotteryOut();

        SendToWinner.sendToy(result);
        Menu.printBye();
    }
}
