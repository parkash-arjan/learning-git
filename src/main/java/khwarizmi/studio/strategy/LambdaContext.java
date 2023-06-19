package khwarizmi.studio.strategy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaContext {

  private Consumer<List<String>> sortStrategy;
  private Function<List<String>, String> searchStrategy;

  public LambdaContext(Consumer<List<String>> sortStrategy,
      Function<List<String>, String> searchStrategy) {
    this.sortStrategy = sortStrategy;
    this.searchStrategy = searchStrategy;
  }

  void sort(List<String> list) {
    sortStrategy.accept(list);
  }

  public void setSortStrategy(Consumer<List<String>> sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void setSearchStrategy(Function<List<String>, String> searchStrategy) {
    this.searchStrategy = searchStrategy;
  }

  public String search(List<String> list) {
    return searchStrategy.apply(list);
  }
}
