package PaternPrint;

public class NinthPattern {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=count;k++) {
				System.out.print(i);
			}
			count=count+2;
			System.out.println();
		}


	}

}
