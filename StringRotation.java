package com.mypackage;




public class StringRotation {

    public static String rotateString(String str, int shift) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int len = str.length();
        shift = shift % len; // Handling shifts greater than string length
        if (shift < 0) {
            shift = len + shift; // Handling negative shifts (left rotation)
        }

        char[] rotated = new char[len];

        // Manually shifting characters
        for (int i = 0; i < len; i++) {
            int newPosition = (i + shift) % len;
            rotated[newPosition] = str.charAt(i);
        }

        // Construct new string from character array
        return new String(rotated);
    }

    
        
    




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
        int shift = 2; // Right rotate by 2

        System.out.println("Original String: " + str);
        System.out.println("Rotated String: " + rotateString(str, shift));
	}

}
