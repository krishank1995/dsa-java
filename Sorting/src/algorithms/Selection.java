package algorithms;

/*
Description:

*/
@Timed
public class Selection implements Sort<Integer> {

  @Override
  public Integer[] sort(Integer[] elements) {

    int minElement = elements[0];

    for(int lowerBound=0;lowerBound<elements.length;lowerBound++){
      for(int selector=lowerBound+1;selector<elements.length;selector++){
        if(elements[selector]<minElement){
          //Swap
          int temp = minElement;
          minElement = elements[selector];
          elements[selector] = temp;
        }
      }
    }
    return elements;
  }
}
