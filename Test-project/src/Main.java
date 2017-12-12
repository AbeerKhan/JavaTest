
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNumbers(1, 4));
		
		Ball myBall = new Ball();
		myBall.color = "blue";
		myBall.size = 24;
		System.out.println(myBall.color);
	
	}
	
	public static int addNumbers(int a, int b) {
		int result = 0;
		result = a + b;
		return result ;
	}

}
