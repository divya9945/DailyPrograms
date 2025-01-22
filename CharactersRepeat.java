package com.mypackage;

public class CharactersRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
        int count;

        
        s = s.toLowerCase();

        
        boolean[] checked = new boolean[s.length()];
        for(int k=0;k<checked.length;k++) {
        System.out.print(checked[k]+" ");
        }

        System.out.println("Repeated characters and their counts:");
        for (int i = 0; i < s.length(); i++) {
            if (checked[i]) {
                continue; 
            }

            count = 1; 

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++; 
                    checked[j] = true; 
                }
            }

            if (count > 1) {
                System.out.println(s.charAt(i) + " = " + count);
            }
        }

	}

}