package hello;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramExample {
	public static void main(String[] args) {
		anagram("appl", "pple");
//		anagram2("appl", "appL", "ppla");
		
		
	}
	
	public static boolean anagram(String str1, String str2) {
		boolean result = false;

		System.out.println("<str1>"+str1);
		System.out.println("<str2>"+str2);
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String char1 = arr1.toString();
		String char2 = arr2.toString();
		
		if(Arrays.equals(arr1, arr2)){
			result = true;
		}
		System.out.println("<arr1>"+Arrays.toString(arr1));
		System.out.println("<arr2>"+Arrays.toString(arr2));
		System.out.println("<result>"+result);
		return result;
	}
	
//	public static boolean anagram2(String str1, String str2, String str3) {
//		boolean result = false;
//
//		System.out.println("<anagram2 str1>"+str1);
//		System.out.println("<anagram2 str2>"+str2);
//		System.out.println("<anagram2 str3>"+str3);
//		
//		char [] arr1 = str1.toLowerCase().toCharArray();
//		char [] arr2 = str2.toLowerCase().toCharArray();
//		char [] arr3 = str3.toLowerCase().toCharArray();
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		Arrays.sort(arr3);
////		ArrayList<String> reArr1 = Arrays.sort(arr1).to;
//		String char1 = arr1.toString();
//		String char2 = arr2.toString();
//		
//		if(Arrays.equals(arr1, arr2)){
//			result = true;
//		}
//		System.out.println("<anagram2 resul arr1>"+Arrays.toString(arr1));
//		System.out.println("<anagram2 resul arr2>"+Arrays.toString(arr2));
//		System.out.println("<anagram2 resul arr2>"+Arrays.toString(arr3));
//		System.out.println("<result>"+result);
//		return result;
//	}
}
