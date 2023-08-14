package fabric;

public class GoldGen extends ItemGen{
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
