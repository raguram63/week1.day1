package week1.day1;

public class Mobile {
	
	//Method
	public static void makeCall() {
		boolean makecall = true;
		System.out.println("Call forwarding  :"  +makecall);
	
	}
	
	public static void sendMsg() {
		
		boolean sendMsg = false;
		System.out.println("Message sending  :"   +sendMsg);
		
	}
	
  
	//Main Method
	public static void main(String[] args) {
		
		makeCall();
		sendMsg();
		String mymobile="this is my Mobile";
		System.out.println(mymobile);
	
	}
	
	
}
