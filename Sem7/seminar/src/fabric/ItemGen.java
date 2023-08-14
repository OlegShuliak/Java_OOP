package fabric;

public abstract class ItemGen {

    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract IGameItem createItem();
}
