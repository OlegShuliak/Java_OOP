import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Product> bottleOfWaterList = new ArrayList<Product>();
        bottleOfWaterList.add(new BottleOfWater("Кола", 3, 0.5));
        bottleOfWaterList.add(new BottleOfWater("Спрайт", 2.9, 0.5));
        bottleOfWaterList.add(new BottleOfWater("Пепси", 2.75, 0.5));
        bottleOfWaterList.add(new BottleOfWater("Фанта", 2.8, 0.5));
        BottleOfWaterVendingMachine bottleOfWaterVendingMachine = new BottleOfWaterVendingMachine(bottleOfWaterList);

        List<Product> hotDrinksList = new ArrayList<Product>();
        hotDrinksList.add(new HotDrinks("Чай", 1.5, 0.3, 50));
        hotDrinksList.add(new HotDrinks("Чай", 1.7, 0.4, 80));
        hotDrinksList.add(new HotDrinks("Кофе", 2.5, 0.3, 50));
        hotDrinksList.add(new HotDrinks("Кофе", 2.7, 0.4, 80));
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(hotDrinksList);

        boolean f = true;
        while (f) {
            System.out.println("Выберите напиток:");
            System.out.println("1 - Напитки в бутылках.");
            System.out.println("2 - Горячие напитки.");
            System.out.println("0 - Завершение работы.");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 1:
                    for (Product name: bottleOfWaterList) {
                        System.out.println((BottleOfWater) name);
                    }
                    System.out.println("Введите название напитка из списка:");
                    String bottleName = scanner.nextLine();
                    bottleOfWaterVendingMachine.getProduct(bottleName);
                    break;
                case 2:
                    for (Product name: hotDrinksList) {
                        System.out.println((HotDrinks) name);
                    }
                    System.out.println("Введите название напитка из списка:");
                    String hotName = scanner.nextLine();
                    System.out.println("Введите объём напитка:");
                    double hotVol= Double.parseDouble(scanner.nextLine());
                    System.out.println("Введите температуру напитка:");
                    int hotTemper= Integer.parseInt(scanner.nextLine());
                    hotDrinksVendingMachine.getProduct(hotName, hotVol, hotTemper);
                    break;
                case 0:
                    System.out.println("Спасибо за покупку.");
                    f = false;
                    break;
                default:
                    System.out.println("Данных напитков нет в списке, повторите попытку.");
                    break;
            }
        }
    }
}
