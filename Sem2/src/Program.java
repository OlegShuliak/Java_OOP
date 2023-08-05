public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Коля");
        Human human2 = new Human("Вася");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}