package khwarizmi.studio.strategy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaClient {

  public static void main(String[] args) {

    List<String> list = List.of("b", "a", "c");
    Consumer<List<String>> bubbleSort = l -> System.out.println("List sorted using Bubble sort implementation");

    Function<List<String>, String> binarySearch = list1 -> {
      System.out.println("list is binary searched");
      return null;
    };

    LambdaContext context = new LambdaContext(bubbleSort, binarySearch);

    context.sort(list);
    String searchedElement = context.search(list);

    System.out.println("-------------");

    Consumer<List<String>> quickSort = list1 -> System.out.println("List sorted using Quick sort implementation");

    Function<List<String>, String> linearSearch = l -> {
      System.out.println("list is linearly searched");
      return null;
    };

    context.setSortStrategy(quickSort);
    context.setSearchStrategy(linearSearch);
    context.sort(list);
    context.search(list);
  }

}