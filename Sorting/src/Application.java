import algorithms.Bubble;
import algorithms.Selection;
import algorithms.Sort;
import java.io.*;

public class Application {

  public static void main(String[] args) {
    Integer[] testCase = InputOutputHelper.generateSortingTestCaseForInt(50000);
    InputOutputHelper.consolePrintArray("Input:",testCase);
    // Bubble Sort
    InputOutputHelper.consolePrintArray("Selection Output:",Sort.execute(new Selection(), testCase));
    //Selection Sort
    InputOutputHelper.consolePrintArray("Bubble Output:",Sort.execute(new Bubble(), testCase));
    }
}
