package khwarizmi.studio.strategy;

import java.util.List;

class BubbleSortStrategyImpl implements SortStrategy {

  @Override
  public void sort(List<String> list) {
    System.out.println("List sorted using Bubble sort implementation");
  }
}