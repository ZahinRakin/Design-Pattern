package Creator;

import Product.Product;
import Product.ConcreteProductB;

public class CreatorB extends Creator {
  public Product createProduct() {
    return new ConcreteProductB();
  }
}
