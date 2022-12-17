package Generators;

import Abstract.GameItem;
import Abstract.ItemGenerator;
import Rewards.HealthRewards;

public class HealthGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new HealthRewards();
    }
}
