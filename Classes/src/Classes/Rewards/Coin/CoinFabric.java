package Classes.Rewards.Coin;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class CoinFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Coin();
    }
}
