import java.util.Scanner;
/*
*
*/
class AddLargeNumbers {
    /**
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(String number) {
    	LinkedList digit = new LinkedList();
    	for (int i = 0; i < number.length(); i++) {
			//System.out.println(number.charAt(i));
			digit.pushLeft(number.charAt(i));
		}
		//System.out.println(number);
		return digit;
    }
    public static String digitsToNumber(LinkedList list) {

    	System.out.println(list);
    	return "";
    }
    

    // public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    // 	LinkedList digit = new LinkedList();
    // 	return digit;
    // }
}

/**
 * Class for solution.
 */
public class Solution {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            // case "addLargeNumbers":
            //     pDigits = AddLargeNumbers.numberToDigits(p);
            //     qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }   
}
