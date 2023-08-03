import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    private List<Product> products;

    public HotDrinksVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrinks getProduct(String name, double volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrinks) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrinks) product).getVolume() == volume && ((HotDrinks) product).getTemperature() == temperature) {
                    return (HotDrinks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
