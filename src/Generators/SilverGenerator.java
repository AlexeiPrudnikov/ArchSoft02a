package Generators;

import Abstract.GameItem;
import Abstract.ItemGenerator;
import Rewards.SilverRewards;

public class SilverGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new SilverRewards();
    }
}
