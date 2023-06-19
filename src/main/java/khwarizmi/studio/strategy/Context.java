package khwarizmi.studio.strategy;

import java.util.List;

public class Context {

  private SortStrategy sortStrategy;

  private SearchStrategy searchStrategy;

  public Context(SortStrategy sortStrategy, SearchStrategy searchStrategy) {
    this.sortStrategy = sortStrategy;
    this.searchStrategy = searchStrategy;
  }

  public void setSortStrategy(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void setSearchStrategy(SearchStrategy searchStrategy) {
    this.searchStrategy = searchStrategy;
  }

  public void sort(List<String> list) {
    sortStrategy.sort(list);
  }

  public String search(String s) {
    // perform search
    return searchStrategy.search(s);
  }
}
