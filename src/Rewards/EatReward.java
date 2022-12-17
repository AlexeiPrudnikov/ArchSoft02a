package Rewards;

import Abstract.GameItem;

public class EatReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Eat");
    }
}
