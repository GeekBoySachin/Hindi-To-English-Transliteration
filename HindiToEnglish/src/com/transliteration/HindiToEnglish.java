package com.transliteration;

import java.util.HashMap;
import java.util.Scanner;

public class HindiToEnglish {

	private final static HashMap<Character, String> map = new HashMap<Character, String>();
	static {

		map.put('अ', "a");
		map.put('आ', "a");
		map.put('इ', "i");
		map.put('ई', "i");
		map.put('उ', "u");
		map.put('ऊ', "ū");
		map.put('ए', "e");
		map.put('ऐ', "ai");
		map.put('ओ', "o");
		map.put('क', "ka");
		map.put('ख', "kha");
		map.put('ग', "ga");
		map.put('घ', "gha");
		map.put('ङ', "nga");
		map.put('च', "cha");
		map.put('छ', "chha");
		map.put('ज', "ja");
		map.put('झ', "jha");
		map.put('ञ', "nya");
		map.put('ट', "ta");
		map.put('ठ', "tha");
		map.put('ड', "da");
		map.put('ढ', "dha");
		map.put('ण', "na");
		map.put('त', "ta");
		map.put('थ', "tha");
		map.put('द', "da");
		map.put('ध', "dha");
		map.put('न', "na");
		map.put('प', "pa");
		map.put('फ', "pha");
		map.put('ब', "ba");
		map.put('भ', "bha");
		map.put('म', "ma");
		map.put('य', "ya");
		map.put('र', "ra");
		map.put('ल', "la");
		map.put('व', "wa");
		map.put('श', "sha");
		map.put('ष', "sha");
		map.put('स', "sa");
		map.put('ह', "ha");
		map.put('ा', "a");
		map.put('ि', "i");
		map.put('ी', "i");
		map.put('ु', "u");
		map.put('ू', "u");
		map.put('ृ', "ri");
		map.put('े', "e");
		map.put('ै', "ai");
		map.put('ो', "o");
		map.put('ौ', "au");
		map.put('ं', "n");
		map.put('ँ', "m");
		map.put('ः', "h");
		map.put('क़', "qa");
		map.put('ख़', "kha");
		map.put('ग़', "gha");
		map.put('ज़', "za");
		map.put('ड़', "ra");
		map.put('ढ़', "rha");
		map.put('फ़', "fa");
		map.put('ळ', "la");
		map.put('०', "0");
		map.put('१', "1");
		map.put('२', "2");
		map.put('३', "3");
		map.put('४', "4");
		map.put('५', "5");
		map.put('६', "6");
		map.put('७', "7");
		map.put('८', "8");
		map.put('९', "9");
		map.put(' ', " ");
		map.put('्', "");
	}

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String s= sc.nextLine();
			sc.close();
			String englishWord = "";
			int c=s.length();
			for (int i = 0; i < s.length(); i++) {
				if ((String.valueOf(s.charAt(i)).equalsIgnoreCase("ा") || String.valueOf(s.charAt(i)).equalsIgnoreCase("ि") || String.valueOf(s.charAt(i)).equalsIgnoreCase("्")
						|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ी") || String.valueOf(s.charAt(i)).equalsIgnoreCase("ु") || String.valueOf(s.charAt(i)).equalsIgnoreCase("ॄ")
						|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ू" )|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ृ")
						|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ॅ") || String.valueOf(s.charAt(i)).equalsIgnoreCase("े")
						|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ॉ") || String.valueOf(s.charAt(i)).equalsIgnoreCase("ो")
						|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ौ")) || String.valueOf(s.charAt(i)).equalsIgnoreCase("्") && englishWord.charAt(englishWord.length() - 1) == 'a') {
					englishWord = englishWord.substring(0, englishWord.length() - 1);
				}
				
				englishWord = englishWord + String.valueOf(map.get(s.charAt(i)));
				if(c==(i+1) && s.charAt(i) !='ा'  && englishWord.charAt(englishWord.length()-1)=='a') {
					englishWord=englishWord.substring(0,englishWord.length()-1);
				}
			}
			System.out.println(s + " ------> " + englishWord);
		
		
	}
}
