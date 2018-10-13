import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// empty constructor
	}
	/**
	 * main method
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.nextLine());
		MinPQ<Stock> min = new MinPQ<Stock>();
		MaxPQ<Stock> max = new MaxPQ<Stock>();
		for (int i = 0; i < s; i++) {
			String[] tokens = scan.nextLine().split(",");
			Stock a = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			max.insert(a);
			min.insert(a);
		}
	}
}