import java.util.Scanner;

/**
 * Class to handle inputs and deliver outputs.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * The main function to take inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Problem l;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            l = new Problem(Integer.parseInt(tokens[0]),
                Integer.parseInt(tokens[1]));
            l.josephproblem();
        }
    }
}
