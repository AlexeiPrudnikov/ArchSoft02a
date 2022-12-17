import Abstract.ItemGenerator;
import Generators.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new EatGenerator());
        generatorList.add(new HealthGenerator());
        generatorList.add(new SilverGenerator());
        int index = 0;
        for (int i = 0; i < 10; i++) {
            switch (Math.abs(random.nextInt() % generatorList.size())) {

            }
            index = Math.abs(random.nextInt() % generatorList.size());
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}