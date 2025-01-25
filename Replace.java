package mypackage;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Hello World";
char a[] = s1.toCharArray(); 
String result = ""; 

for(int i = 0; i < s1.length(); i++) {
	if (a[i] == ' ') {
        result = result + "%d"; 
    } else {
        result = result + a[i]; 
    }
}
System.out.println(result);
	}

}
