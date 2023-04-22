package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

    //Получение имени
    public String getName() {        
        return name;
    }

    //Проверка, сделал ли клиент заказ
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    //Проверка, забрал ли клиент заказ
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    //Установка значения isMakeOrder
    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    //Установка значения isTakeOrder
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    //Получение самого actor
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}