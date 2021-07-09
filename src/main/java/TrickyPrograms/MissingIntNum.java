package TrickyPrograms;

public class MissingIntNum {

	public static void main(String[] args) {
		// How to find out the missing int number from an array
		//n(n+1)/2..... 1,2,3,4,5.........5(5+1)/2....30/2........15
		//1,2,3,5.........11.....15-11=4
		
		int num[]= {1,2,3,4};
		int missingNum=findNumber(num,5);
		System.out.println(missingNum);

	}
	
	public static int findNumber(int num[], int totalNum) {
		
		int expSum=totalNum * ((totalNum+1)/2);
		int actSum=0;
		for(int i:num) {
			actSum =actSum+i;
			
		}
		return expSum-actSum;
		
	}

}
