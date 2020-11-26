package algorithms;

import java.lang.reflect.Proxy;

public interface Sort<T> {

  T[] sort (T[] elements);

  public static Object[] execute(Sort sortingAlgorithm,Integer[] input){
    if(sortingAlgorithm.getClass().isAnnotationPresent(Timed.class)){
      long startTime = System.nanoTime();
      Object[] result = sortingAlgorithm.sort(input);
      long stopTime = System.nanoTime();
      double executionTime = stopTime-startTime;
      System.out.println("Execution Time In ms:" + executionTime/1000000);
      return result;
    }
    return sortingAlgorithm.sort(input);
  }

}
