import java.util.Scanner;
class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        String largest = getLargestNumber(input);
        String smallest = getSmallestNumber(input);

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
    public static String getLargestNumber(String input) {
        char[] digits = input.toCharArray();
        // Sort the digits in descending order
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return new String(digits);
    }

    public static String getSmallestNumber(String input) {
        char[] digits = input.toCharArray();
        // Sort the digits in ascending order
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] > digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        if (digits == '0')
        {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0') {
                    // Swap the first non-zero with the zero at the start
                    char temp = digits;
                    digits = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }
        return new String(digits);
    }
}
