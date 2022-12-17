package Generators;

import Abstract.GameItem;
import Abstract.ItemGenerator;
import Rewards.EatReward;

public class EatGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new EatReward();
    }
}
