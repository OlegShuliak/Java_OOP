package fabric;

public class GemGen extends ItemGen{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
