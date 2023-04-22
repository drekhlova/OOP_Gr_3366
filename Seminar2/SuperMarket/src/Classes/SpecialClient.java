package Classes;

//Класс VIP клиента

public class SpecialClient extends Actor{
    private int idVIP;

    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    //Получение имени
    @Override
    public String getName() {
        return super.name;
    }

    //Получение номера (идентификатора) VIP
    public int getIdVIP() {
        return idVIP;
    }

    //Проверка, сделал ли клиент заказ
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    //Проверка, забрал ли клиент заказ
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
