package IoHelper;


import java.util.Arrays;
import java.util.Random;


public class InputOutputHelper {

  public static void consolePrintArray(String message,Object[] elements){
    System.out.println(message);
    for (Object x :elements ) {
      System.out.println(x);
    }
    System.out.println("\n");
  }

  public static Integer[] generateSortingTestCaseForInt(int sizeOfCollection){
    Random random = new Random(); // creating Random object
    Integer[] testCase = new Integer[sizeOfCollection];
    for (int i = 0; i < testCase.length; i++) {
      testCase[i] = random.nextInt();
    }
    return testCase;
  }


  public static Integer[][] generateSortingTestCaseForInt(int sizeOfEachTestCase,int numberOfTestCases){
    Integer[][] testCases = new Integer[numberOfTestCases][sizeOfEachTestCase];
    for(int n=0;n<numberOfTestCases;n++){
      testCases[n] = generateSortingTestCaseForInt(sizeOfEachTestCase);
    }
    return testCases;
  }

  public static Integer[][] copy2DArray(Integer[][] input){
    Integer[][] copy = new Integer[input.length][input[0].length];
    for(int n=0;n<input.length;n++){
      copy[n] = Arrays.copyOf(input[n],input[n].length);
    }
    return  copy;
  }


}
