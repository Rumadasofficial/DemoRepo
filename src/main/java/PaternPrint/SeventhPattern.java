package PaternPrint;

public class SeventhPattern {

	public static void main(String[] args) {
		int c=4;
		for(int i=1;i<=5;i++) {
	    	for(int j=0;j<i;j++) {
	    		System.out.print(i);
	    	}
	    	System.out.println();
	    }
		for(int i=1;i<=4;i++) {
	    	for(int j=4;j>=i;j--) {
	    		System.out.print(c);
	    	}
	    	c--;
	    	System.out.println();
	    }

	}

}
