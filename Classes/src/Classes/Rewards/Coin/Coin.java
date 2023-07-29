package Classes.Rewards.Coin;

import Classes.IGameItem;

public class Coin implements IGameItem {
    @Override
    public void open() {
        System.out.println("Coin");
    }
}
