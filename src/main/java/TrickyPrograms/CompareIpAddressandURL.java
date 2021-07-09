package TrickyPrograms;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareIpAddressandURL {

	public static void main(String[] args) {
		// What will be the output when you compare site URL with its ip address?
		
		//abc.com -->89.90.98.101
		
		try {
			System.out.println(new URL("https://facebook.com/").equals(new URL("https://185.60.216.35")));
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
