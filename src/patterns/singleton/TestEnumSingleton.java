package patterns.singleton;

public class TestEnumSingleton {
  static void main(String[] args) {
    EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
    System.out.println(instance.getName());
    instance.setName("test");
    System.out.println(instance.getName());

    EnumSingletonDemo instance2 = EnumSingletonDemo.INSTANCE;
    System.out.println(instance2.getName());
  }
}
