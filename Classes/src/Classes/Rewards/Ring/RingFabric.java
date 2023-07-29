package Classes.Rewards.Ring;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Ring.Ring;

public class RingFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ring();
    }
}
