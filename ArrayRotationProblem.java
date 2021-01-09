
import java.util.Arrays;

/**
 * Created 04-01-2021 18:00
 *
 * @author Sagar
 */
public class ArrayRotationProblem {
  /*
  this will rotate an array to left with n times
  if i have array {1,2,3,4,5,6,7} then rotating this array with 2 places would be
  {3,4,5,6,7,1,2}
  so here in iteration of n will shift one element left.
  so if n=2 means ,first loop will iterate 2 times
   */
  public static int[] rotateLeft(int[] intArr, int n) {
    //rfotate the array n times
    for (int i = 0; i < n; i++) {
      int firstElement = intArr[0];
      for (int j = 0; j < intArr.length-1; j++) {
        intArr[j] = intArr[j + 1];
      }
      intArr[intArr.length - 1] = firstElement;
    }
    return intArr;
  }

  public static void main(String[] args) {
    int[] intArray={1,2,3,4,5,6,7};
    System.out.println(Arrays.toString(rotateLeft(intArray,2)));

  }
}
