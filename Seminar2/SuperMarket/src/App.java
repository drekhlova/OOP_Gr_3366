import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Classes.PromotionClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
    //    Market market = new Market();
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();

       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Boris");
       iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
       iActorBehaviour item3 = new OrdinaryClient("Dasha");
       iActorBehaviour item4 = new TaxService();
       iActorBehaviour item5 = new PromotionClient("Irina", "2 товара по цене 1");
       iActorBehaviour item6 = new PromotionClient("Tatyana", "2 товара по цене 1");

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item4);
       market.acceptToMarket(item5);
       market.acceptToMarket(item6);
       item6.getActor().returnOrder();
       market.update();

       market.acceptToMarket(item6);
       item6.getActor().returnOrder();
    }
}