import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toys toy1 = new Toys(0, "Doll", 11);
        Toys toy2 = new Toys(1, "Ball", 30);
        Toys toy3 = new Toys(2, "Bear", 9);
        Toys toy4 = new Toys(3, "Rocket", 15);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);

        ToyShop toyShop = new ToyShop(toys);
        toyShop.saveToyForLottery();
        


    }
    
    
}