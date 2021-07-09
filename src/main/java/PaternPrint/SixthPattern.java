package PaternPrint;

public class SixthPattern {

	public static void main(String[] args) {
    int c=1;
     for(int i=1;i<=4;i++) {
    	 for(int j=0;j<i;j++) {
    		 if(i%2!=0){
    				System.out.print(c);
    		 }else {
    			 System.out.print("*");
    		 }
    		 c++;
    		 
    	 }
    	 System.out.println();
     }

	}

}
