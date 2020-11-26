package algorithms;

import java.lang.reflect.Array;
import java.util.List;

/*
Description:

*/
@Timed
public class Bubble implements Sort<Integer> {

  @Override
  public Integer[] sort(Integer[] elements) {
    for(int lowerBound=0;lowerBound<elements.length;lowerBound++){
      for(int upperBound=lowerBound+1;upperBound<elements.length;upperBound++){
        if(elements[lowerBound]>elements[upperBound]){
          //Swap
          int temp = elements[lowerBound];
          elements[lowerBound] = elements[upperBound];
          elements[upperBound] = temp;
        }
      }
    }
    return elements;
  }
}
