package org.vandhna;

public class PanagramOrNot {
	
	public static void main(String[] args) {
		String s="the five boxing wizards jump quickly";
		System.out.println(isPanagram(s));
		
	}
		public static boolean isPanagram(String s) {
			if(s.length()<26) {
				return false;
			}
			else {
				for(char ch='a';ch<='z';ch++) {
					if(s.indexOf(ch)<0) {
						return false;
					}
				}
			}
			return true;

	
	}
}
