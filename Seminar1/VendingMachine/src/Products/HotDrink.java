package Products;

public class HotDrink extends Product {
    /** объем напитка */
    private int volume;
    /** температура напитка */
    private int temperature;

    /** 
    * Конструктор Горячий напиток
    * @param name Наименование
    * @param price Цена
    * @param temp Температура
    * @param volume Объем напитка 
    */

    public HotDrink(String name, double price, int volume, int temperature)
    {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    /** метод, позволяющий получить объем горячего напитка
     * @return объем
     */
    public int getVolume() {
        return volume;
    }

    /**
     * метод, позволяющий изменить объем горячего напитка
     * @param volume задаем значение объема 
     */

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * метод, позволяющий получить температуру горячего напитка
     * @return температура
     */

    public int getTemperature() {
        return temperature;
    }

    /**
     * метод, позволяющий изменить температуру горячего напитка
     * @param temperature выставляемая температура
     */
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    // переопределение вывода продукта
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", volume=" + temperature +
        '}';
    }
}
