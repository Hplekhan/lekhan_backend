package Strings;

import java.util.Arrays;

public class StringOperations {

	/* 1- Palindrome function */

	public static boolean isPalindrome(String str) {

		int i=0;
		int j =str.length()-1;

		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
//-------------------------------------------------------------------------------------------------------
    /* 2-Panagram */
	
	 public static boolean isPanagram(String string)  
	{   
		string = string.toLowerCase();  
		boolean allPresent = true;  
		for (char ch = 'a'; ch <= 'z'; ch++)   
		{   
			if (!string.contains(String.valueOf(ch)))   
			{  
				allPresent = false;  
				break;  
			}  
		}   
		if (allPresent)  
			System.out.println(" it is Pangram String");  
		else  
			System.out.println("it is not a Pangram String");
		return allPresent;  
	}  
//-----------------------------------------------------------------------------------------------------
	/* 3- Anagram */
	 public static boolean isAnagram(String str1, String str2) {
		
		String input1 =str1.toLowerCase();
		String input2 = str2.toLowerCase();
		
		if(input1.length() == input2.length()) {
			
			 char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1,ch2)) {
				System.out.println("both are anagram");
			}
			else {
				System.out.println("not a anagram");
			}
			
		}
		return true;
	} 
//--------------------------------------------------------------------------------------------------------
	/* 4- Count words */
	
	 public static int CountWords(String str1) {
		int count = 1;
		 
        for (int i = 0; i < str1.length() - 1; i++)
        {
            if ((str1.charAt(i) == ' ') && (str1.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
		return count;
    } 
//------------------------------------------------------------------------------------------------------
	/* 5- countcharcters*/
	public static void countEachCharacters(String word) {
        int[] charCounts = new int[256]; 

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = (int) c; 
            charCounts[index]++;
        }
        
        System.out.println("Character Counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
	
	
//	----------------------------------------------------------------------------------------------------
/* 8- CountVowels*/
	public static int countVowels(String str) {
        str = str.toLowerCase(); 
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' && ch == 'e' && ch == 'i' && ch == 'o' && ch == 'u') {
               count++;
            }
        }
		return count;
    }
	
//-------------------------------------------------------------------------------------------------------
	/* 6- AllVowels*/
	 public static boolean isAllVowels(String str) {
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false; 
            }
        }
        return true;
    } 
	
//	----------------------------------------------------------------------------------------------------
	/* 7- reverseword*/
	
	public static void reverseWord(String str2) {
		
		char ch[] = str2.toCharArray();
		String s =""; 
		
		for (int i = ch.length -1; i >= 0; i--) {
			s = s+ ch[i];
		}
		System.out.println(s.toString());
		
	} 
	
//	---------------------------------------------------------------------------------------------------
	
	 
	
	public static void main(String[] args) {
		String str1 = "listen to music";
		String str2 = "shabuddin";
		
		
		
		/* reverseWord(str2); */
		
		/* if(isAllVowels(str2))
		{
			System.out.println("yes it is");
		}
		else System.out.println("no not contain"); */
		
		 /* countEachCharacters(str2); */
		
		/*  int count = countVowels(str2);
		System.out.println(count); */
		
		/* CountWords(str1); */
		
		 /* isAnagram(str1, str2); */
		
			/* isPanagram(str); */ 
		
		/*boolean Pali = isPalindrome(str);
		if(Pali == true) {
			System.out.println("it is Palindrome");
		}
		else System.out.println("it is not Palindrome "); */

	}

}
