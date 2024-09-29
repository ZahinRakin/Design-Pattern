import Creator.Creator;
import Creator.CreatorA;
import Creator.CreatorB;
import Product.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Creator creator = new CreatorA();
        Product productA = creator.createProduct();
        productA.doStuff();
        creator = new CreatorB();
        Product productB = creator.createProduct();
        productB.doStuff();
    }
}
