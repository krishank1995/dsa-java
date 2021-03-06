package algorithms.impl;

import algorithms.Sort;
import algorithms.aspects.ConsoleSink;
import algorithms.aspects.Timed;
import algorithms.aspects.ValidateExecution;

/*
Description:

*/
@Timed
//@ConsoleSink
@ValidateExecution
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
