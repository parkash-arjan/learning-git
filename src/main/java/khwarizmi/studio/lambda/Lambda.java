package khwarizmi.studio.lambda;

import java.util.function.Consumer;

public class Lambda {

  public static void main(String[] args) {
    Lambda lambda = new Lambda();
    Consumer<String> consumer = lambda::printNames;
    consumer.accept("C++");
    consumer.accept("Java");
    consumer.accept("Python");
    consumer.accept("Ruby On Rails");
  }

  private void printNames(String name) {
    System.out.println(name);
  }
}
