package Products;

public class BottleOfWater extends Product {
    private int volume;
    /**
     * класс Бутылка воды
     * @param name Наименование
     * @param price Цена
     * @param volume Объем
     */

    public BottleOfWater(String name, double price, int volume)
    {
        super(name, price);
        this.volume = volume;
    }

    /**возвращает значение volume
     * @return
     */

    public int getVolume() {
        return volume;
    }
    
    /** указание объема продукта
     * @param volume объем
     */

    public void setVolume(int volume) {
        this.volume = volume;
    }

        /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        '}';
    }
}
