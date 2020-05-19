package day08;

public class Test13 {
	   public static void main(String[] args) {
		      String str = new String("tESt  sTring  change      first");
		      String changeStr = new String();
		      String lowerstr = new String();
		      lowerstr = str.toLowerCase();
		      int count=0;
		      for(int i = 0; i<lowerstr.length(); i++) {
		         if(i==0) {
		            changeStr += (char)(lowerstr.charAt(i)-32);
		            //System.out.println(changeStr);
		            continue;
		         }
		         System.out.println(changeStr);
		         if(lowerstr.charAt(i)==' ') {
		        	count ++;
		        	for(int j = 0; j<count; j++) {
			        	 changeStr += ' ';
			        	 System.out.println(changeStr);
			        	 i++;
			         }
		        	
		        	changeStr += (char)(lowerstr.charAt(i+1)-32);
		         }else {
			            changeStr += lowerstr.charAt(i);
			         }
		      }
		      System.out.println(changeStr);
	}
}

