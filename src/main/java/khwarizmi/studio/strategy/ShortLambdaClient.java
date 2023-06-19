package khwarizmi.studio.strategy;

import java.util.List;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShortLambdaClient {

  public static final String LIST_IS_BINARY_SEARCHED = "list is binary searched";

  public static void main(String[] args) {

    List<String> list = List.of("b", "a", "c");

    LambdaContext context = new LambdaContext(
        l -> log.debug("List sorted using Bubble sort implementation"),
        returnImmediateLambda());

    context.sort(list);
    String searchedElement = context.search(list);

    log.debug("-------------");

    context.setSortStrategy(list1 -> log.debug("List sorted using Quick sort implementation"));
    context.setSearchStrategy(l -> {
      log.debug("list is linearly searched");
      return null;
    });
    context.sort(list);
    context.search(list);
  }

  public static Function<List<String>, String> returnLambda() {
    Function<List<String>, String> binarySearch = list -> {
      log.debug(LIST_IS_BINARY_SEARCHED);
      return null;
    };

    return binarySearch;
  }

  public static Function<List<String>, String> returnImmediateLambda() {
    return list -> {
      log.debug(LIST_IS_BINARY_SEARCHED);
      return null;
    };

  }
}