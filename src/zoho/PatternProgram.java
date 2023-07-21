package zoho;

/*
 input:n = 4 
Output:
   0
  101
 21012
3210123
 */
public class PatternProgram {
	public static void main(String[] args) {
		int n=4,k=0,length=n*2-1,j=0;
		for (int i = 0; i < n; i++) {
			for (j = 0,k=n-1; j < length; j++,k--) {
				if((i+j+1>=n)&&(i>j-n)) {
					System.out.print(Math.abs(k));
				}
				else 
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
