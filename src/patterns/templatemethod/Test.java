package patterns.templatemethod;

public class Test {
  static void main(String[] args) {
    DataRenderer renderer = new XMLRenderer();
    renderer.render();
  }
}
