package patterns.iterator;

public class Test {
  static void main(String[] args) {
    ProductCollection products = new ProductCollection();
    products.addProduct(new Product("ïPhone"));
    products.addProduct(new Product("samsung"));
    products.addProduct(new Product("Mac Book"));

    Iterator iterator = products.createIterator();
    while (iterator.hasNext()) {
      Product product = (Product) iterator.next();
      System.out.println(product.getName());
    }
  }
}
