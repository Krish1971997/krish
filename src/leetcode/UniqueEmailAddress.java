package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
	
	public static void main(String[] args) {
		//String emails[]={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		String emails[]= {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		int count=numUniqueEmails(emails);
		System.out.println(count);
	}

	private static int numUniqueEmails(String[] emails) {
		  Set set=new HashSet();
	        for(String email:emails){
	            int index=email.indexOf("@");
	            String local=email.substring(0,index); //Splits the email id local and domain
	            String domain=email.substring(index);
	            local=local.replace(".",""); //remove .
	            if(local.contains("+")) //ignore after +
	            {
	            	int id=local.indexOf("+");
	                local=local.substring(0,id);
	            }
	            String newEmail=local+domain;
	            set.add(newEmail);
	        }
	        return set.size(); 
		
	}

}
