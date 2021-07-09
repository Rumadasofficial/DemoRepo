package PaternPrint;

public class InterviewPattern {

	public static void main(String[] args) {
		int num=5;
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(num==j){
			System.out.print("*");
			count++;
			}else {
				System.out.print(count);
				count++;
			}
				
				}
			num--;
			count=1;
			System.out.println();
		}
		

	}

}
