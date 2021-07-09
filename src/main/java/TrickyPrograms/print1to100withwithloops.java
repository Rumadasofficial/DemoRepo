package TrickyPrograms;

public class print1to100withwithloops {

	public static void main(String[] args) {
		// 1 to 100 without any loop
      print(5,50);
	}
	
	public static void print(int stnum, int endnum) {
		if(stnum<=endnum) {
			System.out.println(stnum);
			stnum++;
			
		}
		print(stnum,endnum);
	}

}
