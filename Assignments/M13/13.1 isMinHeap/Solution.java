/**
 * imports scanner package.
 */
import java.util.Scanner;
/**
 * class for solution.
 */
public final class Solution {
    /**
     * Constructs the object for solution.
     */
    private Solution() {
        // empty constructor.
    }
    /**
     * { main function }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        switch (s) {
            case "String":
            while (n > 0) {
                String[] tokens = sc.nextLine().split(",");
                MinPQ<String> minimum = new
                MinPQ<String>(tokens);
                System.out.println(minimum.isMinPQ());
                n--;
            }
            break;
            case "Integer":
            while (n > 0) {
                String[] tokens = sc.nextLine().split(",");
                Integer[] integer = new Integer[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    integer[i] =
                    Integer.parseInt(tokens[i]);
                }
                MinPQ<Integer> minimum = new
                MinPQ<Integer>(integer);
                System.out.println(minimum.isMinPQ());
                n--;
            }
            break;
            case "Double":
            while (n > 0) {
                String[] tokens = sc.nextLine().split(",");
                Double[] doubtok = new Double[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    doubtok[i] =
                    Double.parseDouble(tokens[i]);
                }
                MinPQ<Double> minimum = new
                MinPQ<Double>(doubtok);
                System.out.println(minimum.isMinPQ());
                n--;
            }
            break;
            case "Float":
            while (n > 0) {
                String str = sc.nextLine();
                if (str.equals("")) {
                    System.out.println("false");
                    break;
                } else {
                    String[] tokens = str.split(",");
                    Float[] floattok = new
                    Float[tokens.length];
                    for (int i = 0; i < tokens.length;
                        i++) {
                        floattok[i] =
                        Float.parseFloat(tokens[i]);
                    }
                    MinPQ<Float> minimum = new
                    MinPQ<Float>(floattok);
                    System.out.println(
                        minimum.isMinPQ());
                }
                n--;
            }
            break;
        default:
        break;
        }
    }
}
