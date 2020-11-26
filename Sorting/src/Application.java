import algorithms.Bubble;
import algorithms.Selection;
import algorithms.Sort;
import java.io.*;

public class Application {

  public static void main(String[] args) {
    Integer[] testCase = InputOutputHelper.generateSortingTestCaseForInt(5);
    InputOutputHelper.consolePrintArray("Input:",testCase);
    // Selection Sort
    InputOutputHelper.consolePrintArray("Selection Output:",Sort.execute(new Selection(), testCase));
    //Bubble Sort
    InputOutputHelper.consolePrintArray("Bubble Output:",Sort.execute(new Bubble(), testCase));
    }
}
