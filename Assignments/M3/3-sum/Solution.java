import java.util.Scanner;
import java.util.Arrays;
/**
 * class.

 Class for solution.
*/
final class Solution {
/**
 * class.

 Class for solution.
*/
    private Solution() {
    }
    /**
     *  args.
     *
     * @param      args  The arguments
     **/
    public static void main(final String[] args) {
    /**
     *
     *{ var_description }
     **/
        Scanner scan = new Scanner(System.in);
        int arraysize = scan.nextInt();
        int[] array = new int[arraysize];
        int count = 0;
        for (int i = 0; i < arraysize; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int j = 0;
        int k = 0;
        for (int i = 0; i < arraysize; i++) {
            j = i + 1;
            k = arraysize - 1;
            while (j < k) {
                if (array[i] + array[j] + array[k] < 0) {
                    j += 1;
                } else if (array[i] + array[j] + array[k] > 0) {
                    k -= 1;
                } else {
                    j += 1;
                    k -= 1;
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
