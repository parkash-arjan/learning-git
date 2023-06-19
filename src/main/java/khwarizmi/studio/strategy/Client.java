package khwarizmi.studio.strategy;

import java.util.List;

public class Client {

  public static void main(String[] args) {
    List<String> list = List.of("b", "a", "c");
    Context context = new Context(new BubbleSortStrategyImpl(), new BinarySearchStrategyImpl());
    context.sort(list);
    String searchedElement1 = context.search("b");

    System.out.println("---------------");

    context.setSortStrategy(new QuickSortStrategyImpl());
    context.setSearchStrategy(new LinearSearchStrategyImpl());
    context.sort(list);
    String searchedElement2 = context.search("a");
  }
}