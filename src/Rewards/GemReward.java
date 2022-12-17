package Rewards;

import Abstract.GameItem;

public class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}
