package com.prep.tree;

/*III. Given three letters ABC, where AB->C, AC->B, BC->A (sequence doesn’t matter). 
 * Get the length of the path to convert from a given string to a single character. 
 */

public class PathToConverStringToSingleChar {

	
	/*
	 * String stringToMatch = "abccdef";
Pattern p = Pattern.compile("(\\w)\\1+");
Matcher m = p.matcher(stringToMatch);
if (m.find())
{
    System.out.println("Duplicate character " + m.group(1));
}
	 */
	public static void convertPathToSingleChar(String s){
		int steps = 0;
		while(s.length()!=1){
		if(s.contains("AB") || s.contains("BA")){
			if(s.contains("AB")){
				s = s.replace("AB", "C");
				steps++;
			}
			else if(s.contains("BA")){
				s = s.replace("BA", "C");
				steps++;
			}
		}
		else if(s.contains("BC") || s.contains("CB")){
			if(s.contains("BC")){
				s = s.replace("BC", "A");
				steps++;
			}
			else if(s.contains("CB")){
				s = s.replace("CB", "A");
				steps++;
			}

		}
		else if(s.contains("AC") || s.contains("CA")){
			if(s.contains("AC")){
				s = s.replace("AC", "B");
				steps++;
			}
			else if(s.contains("CA")){
				s = s.replace("CA", "B");
				steps++;
			}
		}
		else if(s.contains("AA") || s.contains("BB") || s.contains("CC")){
			steps = -1;
			break;
		}
		}
		System.out.println(steps);
	}
	 public static void main(String[] args) {
		 convertPathToSingleChar("ABACB");
		 convertPathToSingleChar("AAA");
		 convertPathToSingleChar("ABACABB");
	 }
}
