package Generators;

import Abstract.GameItem;
import Abstract.ItemGenerator;
import Rewards.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
