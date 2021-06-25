package strings;

public class SplitStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		
		for(int i=1; i<100; i++) {
			s1 = s1 + "o";
		}
		
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb); //sb is a string builder and not a string
		String s2 = sb.toString(); //this is how to convert from string builder to string
		System.out.println(s2);
		
		for(int i=1; i<100; i++) { //this is much more memory efficient to append rather than creating a new string everytime we concatenate
			sb.append("o");
		}
		System.out.println(sb);
	}

}
