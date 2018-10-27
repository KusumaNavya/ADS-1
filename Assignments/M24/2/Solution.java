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
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        LinearProbingHashST<Integer, Student> part =
                new LinearProbingHashST<>(lines);
        for (int i = 0; i < lines; i++) {
            String[] tokens = scan.nextLine().split(",");
            Student list = new Student(Integer.parseInt(tokens[0]),
                                     tokens[1],
                                     Double.parseDouble(tokens[2]));
            part.put(Integer.parseInt(tokens[0]), list);
        }
        int querys = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < querys; j++) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "BE":
                System.out.println(part.get(
                        Integer.parseInt(tokens[1])).getName());
                break;
            case "LE":
                    System.out.println(part.get(
                        Integer.parseInt(tokens[1])).getName());
                break;
            case "GE":
                    System.out.println(part.get(
                        Integer.parseInt(tokens[1])).getName());
                break;
            default:
            break;
            }
        }
    }
}
