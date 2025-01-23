
package com.mypackage;
public class Permutation {
    
    public static void generatePermutations(String str, String result) {
       
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        
        for (int i = 0; i < str.length(); i++) {
          
            char currentChar = str.charAt(i);

           
            String remainingString = str.substring(0, i) + str.substring(i + 1);

          
            generatePermutations(remainingString, result + currentChar);
        }
    }

   
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of the string "" + input + " ":");
        generatePermutations(input, " ");
    }
}
