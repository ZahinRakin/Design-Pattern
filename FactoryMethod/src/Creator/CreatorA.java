package Creator;

import Product.Product;
import Product.ConcreteProductA;

public class CreatorA extends Creator {
  public Product createProduct() {
    return new ConcreteProductA();
  }
}
