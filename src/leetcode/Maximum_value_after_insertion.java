package leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/maximum-value-after-insertion/
public class Maximum_value_after_insertion {

	public static void main(String[] args) {
		int n=-13, x=2;
		System.out.println(maxValue(n,x));
	}

	private static int maxValue(int n, int x) {
		boolean isNegative=false;
		if(n<0||x<0)
			isNegative=true;
		
		String first=String.valueOf(n);
		String second=String.valueOf(x);
		String result="";
		
		char[] res=new char[first.length()+second.length()];
		int i=0;
		for(int j=0;j<first.length();j++)
			res[i]=first.charAt(j);
		
		for(int j=0;j<second.length();j++)
			res[i]=second.charAt(j);
		
		for (char c : res) {
			result+=c;
		}
			
		return 0;
	}

}
