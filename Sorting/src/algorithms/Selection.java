package algorithms;

/*
Description:

*/
@Timed
public class Selection implements Sort<Integer> {

  @Override
  public Integer[] sort(Integer[] elements) {
    for(int counter=0;counter<elements.length;counter++){
      int minIndexInSubarray = getMinElementIndex(elements,counter,elements.length);
      //Swap
      int temp = elements[counter];
      elements[counter] = elements[minIndexInSubarray];
      elements[minIndexInSubarray] = temp;
    }
    return elements;
  }

  private int getMinElementIndex(Integer[] elements,Integer lowerBound,Integer upperBound){
    int minElement = Integer.MAX_VALUE;
    int minElementIndex = lowerBound;
    for(int i=lowerBound;i<upperBound;i++){
      if(minElement>elements[i]){
        minElement=elements[i];
        minElementIndex=i;
      }
    }
    return minElementIndex;
  }
}
