package Classes.Rewards.Gold;

import Classes.ItemGenerator;
import Classes.IGameItem;
import Classes.Rewards.Gold.Gold;

public class GoldFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }

}