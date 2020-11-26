import algorithms.Sort;
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


}
