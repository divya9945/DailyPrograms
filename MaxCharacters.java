package mypackage;





public class MaxCharacters {


    public static void main(String[] args) {
        String s1 = "hello"; // Example input
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII)

        // Count the frequency of each character
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i); // Get the current character
            frequency[c]++; // Increment its frequency
        }

        // Find the character with the maximum frequency
        char maxChar = '0'; // Initialize the character
        int maxCount = 0;    // Initialize the maximum count

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) { // Check if this frequency is greater
                maxCount = frequency[i];  // Update the maximum count
                maxChar = (char) i;       // Update the character
            }
        }

        // Print the result
        if (maxCount > 1) { // Check if any character is repeated
            System.out.println("The maximum repeated character is '" + maxChar + "' with " + maxCount + " occurrences.");
        } else {
            System.out.println("No character is repeated in the string.");
        }
    }
}