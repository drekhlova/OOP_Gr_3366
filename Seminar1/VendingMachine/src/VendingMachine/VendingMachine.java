package VendingMachine;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private int temperature;
    private List<Product> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }
    /**
     * метод, позволяющий получить информацию о вместимости устройства 
     * @return max количество продуктов/напитков
     */

    public void addProduct(Product prod)
    {
        products.add(prod);
    }
    public int getVolume() {
        return volume;
    }

    /**метод, позволяющий задать вместимость аппарата
     * @param volume введи макс вместомость аппарата
     */

     public void setVolume(int volume){
        this.volume = volume;
     }

     /** метод для ведения журнала продаж
      * @param line проданный товар
     */

    public void addSales(String line)
    {
        workLog.add(line);
    }

    /**метод для поиска продукта в каталоге
     * @param name запрос по наименованию
     * @return при наличии возвращает искомый продукт
     */

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    /**метод, позволяющий посмотреть весь каталог товаров в аппарате
     * @return имеющиеся товары в аппарате
     */
    
    public List<Product> getProdAll()
    {
        return products;
    }
}
