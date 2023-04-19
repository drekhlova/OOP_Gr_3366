import Products.Product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Жвачка",40.0);
        item1.setPrice(40.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachin.addProduct(new HotDrink("Американо", 80, 150, 90));
        itemMachin.addProduct(new HotDrink("Эспрессо", 80, 60, 67));
        itemMachin.addProduct(new HotDrink("Двойной эспрессо", 80, 60, 67));
        itemMachin.addProduct(new HotDrink("Капучино", 100, 200, 65));
        itemMachin.addProduct(new HotDrink("Латте", 110, 200, 70));

        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}
