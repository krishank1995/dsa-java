package algorithms;

import IoHelper.InputOutputHelper;
import algorithms.aspects.ConsoleSink;
import algorithms.aspects.Timed;
import algorithms.aspects.ValidateExecution;

import java.util.Arrays;

public interface Sort<T> {

  public static final String EXECUTION_TIME_DISPLAY_FORMAT = "Execution time for %s in milli-seconds: %s \n";
  public static final String INPUT_DISPLAY_FORMAT = "Input for %s";
  public static final String OUTPUT_DISPLAY_FORMAT = "Output for %s";
  public static final String VALIDATION_MESSAGE_DISPLAY_FORMAT = "Is Output correct for %s : %s \n";

  T[] sort (T[] elements);

  public static Object[] execute(Sort sortingAlgorithm,Object[] input){

    boolean printToConsole = sortingAlgorithm.getClass().isAnnotationPresent(ConsoleSink.class);
    boolean validationRequired = sortingAlgorithm.getClass().isAnnotationPresent(ValidateExecution.class);
    Object[] inputCopy = Arrays.copyOf(input,input.length);

    if(printToConsole){
      InputOutputHelper.consolePrintArray(String.format(INPUT_DISPLAY_FORMAT,sortingAlgorithm.getClass().getSimpleName()),input);
    }

    Object[] result;
    if(sortingAlgorithm.getClass().isAnnotationPresent(Timed.class)){
      long startTime = System.nanoTime();
      result = sortingAlgorithm.sort(input);
      long stopTime = System.nanoTime();
      double executionTime = stopTime-startTime;
      System.out.println(String.format(EXECUTION_TIME_DISPLAY_FORMAT,sortingAlgorithm.getClass().getSimpleName(),executionTime/1000000));
    }else{
      result = sortingAlgorithm.sort(input);
    }

    if(printToConsole){
      InputOutputHelper.consolePrintArray(String.format(OUTPUT_DISPLAY_FORMAT,sortingAlgorithm.getClass().getSimpleName()),input);
    }

    if(validationRequired){
      System.out.println(String.format(VALIDATION_MESSAGE_DISPLAY_FORMAT,sortingAlgorithm.getClass().getSimpleName(),validateResult(inputCopy,result)));
    }

    return result;
  }

  //For Validate Sorting results for Large Data-set
  public static boolean validateResult(Object[] testCase,Object[] result){
    Arrays.sort(testCase); //Uses inbuilt Java.Utils to validate : TimSort
    return Arrays.equals(testCase,result); // Iterates over elements simultaneously and validates
  }

}
