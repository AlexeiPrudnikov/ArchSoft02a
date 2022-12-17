package Rewards;

import Abstract.GameItem;

public class HealthRewards implements GameItem {
    @Override
    public void open() {
        System.out.println("Health");
    }
}
