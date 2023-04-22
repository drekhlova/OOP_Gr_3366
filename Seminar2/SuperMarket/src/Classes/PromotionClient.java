package Classes;

//Класс акционного клиента

public class PromotionClient extends Actor{
    //Название акции
    private String promotion;
    //Номер клиента в акции 
    private static int promoClientNumber;

    /** Конструктор Акционный клиент
    * @param promotion Название акции
    * @param promoClientNumber Номер клиента в акции
    */
    
    public PromotionClient(String name, String promotion) {
        super(name);
        this.promotion = promotion;
        promoClientNumber++; 

    }

    //Получение названия акции, в которой участвует клиент
    //public String getPromotionName() {
    //    return promotion;
    //}
    
    //Получение номера клиента в акции
    //public int getPromotionClientNumber() {
    //    return promoClientNumber;
    //}

    @Override
    public String getName() {
        return super.name;
    }

    //Проверка сделал ли клиент заказ
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    //Проверка забрал ли клиент заказ
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    //Установка значения isMakeOrder
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    //Установка значения isTakeOrder
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    //Получение самого actor
    @Override
    public Actor getActor() {
        return this;
    }

    //Возврат заказа клиентом
    public void returnOrder() {
        if (super.isTakeOrder) {
            System.out.println("Клиент " + this.getName() + " вернул заказ.");
        }
    }
}