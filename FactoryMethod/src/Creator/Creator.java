package Creator;

import Product.Product;

public abstract class Creator {
  public Product doSomething() {
    Product product = createProduct();
    product.doStuff();
    return product;
  }

  public abstract Product createProduct();
}
