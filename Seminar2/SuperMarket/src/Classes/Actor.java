package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
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
