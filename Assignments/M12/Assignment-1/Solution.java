import java.util.Scanner;
import java.util.Arrays;
class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
		/*empty constructor*/
	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int i = 6;
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "#");
        }
        String[] lines = sb.toString().split("#");
        System.out.println(lines);
        Student[] students = new Student[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            students[i++] = new Student(tokens[0],
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[3]),
                Integer.parseInt(tokens[4]),
                Integer.parseInt(tokens[5]),
                tokens[6]);
        }
        Insertion.sort(students);
        String result = Arrays.toString(students);
        result = result.replace("[", "").replace("]", "").replace(", ", ",");
        System.out.println(result);
	}
}