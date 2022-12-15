import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
//        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
//        System.out.println(mach1);

        Energy energy1 = new Energy("RedBull", 88, 218.86F, 0.499F );
        energy1.setVolume(0.38F);
        energy1.setName("Adrenaline");



        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine",12));
        tovary.add(new Product("dust",10));
        tovary.add(new Soda("kind", 19, "grapes"));
        tovary.add(new Milk("Prostokvashino", 70.0, 2.499F, 0.89F));
        tovary.add(energy1);



        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);
//        System.out.println(mach2.findByName("kind"));
//        System.out.println(mach2.findByPrice(12));
        System.out.println(mach2.findByPriceRange(9,100));

    }
}
