import java.util.Scanner;
/**
 * {solution class}
 */
public final class Solution {
    /**
     * empty constructor.
     */
    private Solution() {
        //empty
    }
    /**.
     * {main function}
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        final int three = 3;
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        LinearProbingHashST<Integer, Student> part =
                new LinearProbingHashST<>(three * lines);
        for (int i = 0; i < lines; i++) {
            String[] tokens = scan.nextLine().split(",");
            Student list = new Student(Integer.parseInt(tokens[0]),
                                     tokens[1],
                                     Double.parseDouble(tokens[2]));
            part.put(Integer.parseInt(tokens[0]), list);
        }
    }
}