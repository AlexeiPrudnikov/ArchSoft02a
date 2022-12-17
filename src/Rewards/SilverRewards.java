package Rewards;

import Abstract.GameItem;

public class SilverRewards implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}
