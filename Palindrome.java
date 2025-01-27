package mypackage;


public class Palindrome {

    public static void main(String[] args) {
        String str = "madam"; // Example input string
        boolean isPalindrome = true; // Flag to track if the string is a palindrome

        int n = str.length(); // Get the length of the string

        // Loop to compare characters from the beginning and end
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false; // If mismatch found, it's not a palindrome
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
