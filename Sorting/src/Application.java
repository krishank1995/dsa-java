import IoHelper.InputOutputHelper;
import algorithms.impl.Bubble;
import algorithms.impl.Selection;
import algorithms.Sort;

public class Application {

  public static final Integer NUMBER_OF_TEST_CASES = 2;
  public static final Integer SIZE_OF_TEST_CASE = 50000;

  public static void main(String[] args) {
    Integer[][] testCases = InputOutputHelper.generateSortingTestCaseForInt(SIZE_OF_TEST_CASE,NUMBER_OF_TEST_CASES);

    // Selection Sort
    Sort.execute(new Selection(), testCases[0]);

    //Bubble Sort
    Sort.execute(new Bubble(), testCases[1]);

  }
}
