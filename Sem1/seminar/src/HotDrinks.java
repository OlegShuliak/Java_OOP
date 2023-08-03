public class HotDrinks extends BottleOfWater {

    private int temperature;

    public HotDrinks(String name, Double cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + super.getName() + '\'' +
                "volume='" + super.getVolume() + '\'' +
                "temperature='" + temperature + '\'' +
                "cost=" + super.getCost() +
                '}';
    }
}
