package mypackage;

public class StringCompressed {    
	        public static String compressString(String str) {
	            
	            if (str == null || str.length() == 0) {
	                return str;
	            }
	
	            
	            StringBuilder compressed = new StringBuilder(); 
	            char currentChar = str.charAt(0); 
	            int count = 1;
	
	           
	            for (int i = 1; i < str.length(); i++) {
	                if (str.charAt(i) == currentChar) {
	                  
	                    count++;
	                } else {
	                   
	                    compressed.append(currentChar).append(count);
	
	                    
	                    currentChar = str.charAt(i);
	                    count = 1;
	                }
	            }
	
	      
	            compressed.append(currentChar).append(count);
	
	            
	            String compressedString = compressed.toString();
	
	           
	            return compressedString.length() < str.length() ? compressedString : str;
	        }
	
	        public static void main(String[] args) {
	            
	            String str1 = "aabcccccaaa";
	            System.out.println("Original: " + str1 + " -> Compressed: " + compressString(str1)); 
	           
	        }
	    }