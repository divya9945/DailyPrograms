

package com.mypackage;

public class OneAway {

	
		boolean isOneAway(String str1, String str2) {
			
			if (str1.length() == str2.length()) {
				return isReplace(str1, str2);
			 } else if (str1.length() + 1 == str2.length()) {
			        	return isInsert(str1, str2);
			 }
			else if (str2.length() + 1 == str1.length()) {
				return isInsert(str2, str1);
			 }
			return false;
		}
		
		boolean isInsert(String str1, String str2) {
			int index1 = 0;
			int index2 = 0;
			while (index1 < str1.length()) {
				if (str1.charAt(index1) != str2.charAt(index2)) {
					if (index1 != index2) {
						return false;
		             }
					index2++;
		         } else {	
		        	 index1++;
		        	 index2++;
		         }
		    }
			return true;
		}
		boolean isReplace(String str1, String str2) {
		boolean findDiff = false;
		for (int i = 0; i < str1.length(); i++) {
		if (str1.charAt(i) != str2.charAt(i)) {
		if (findDiff) {
		return false;
		                }
		findDiff = true;
		            }
		        }
		return true;
		    }
		public static void main(String[] args) {
		OneAway oa = new OneAway();
		System.out.println(oa.isOneAway("pale", "balle"));
		    }
		}


