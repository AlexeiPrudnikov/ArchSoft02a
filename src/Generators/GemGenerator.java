package Generators;

import Abstract.GameItem;
import Abstract.ItemGenerator;
import Rewards.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
