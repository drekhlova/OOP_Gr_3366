package Classes;

//Абстрактный класс Actor для всех клиентов

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    //получил заказ
    protected boolean isTakeOrder;
    //сделал заказ
    protected boolean isMakeOrder;
    //конструктор - ПКМ Source Action... 
    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName(); 

}
