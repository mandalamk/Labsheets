@FunctionalInterface
interface powerCal{
	
	public double power(double x,double y);
}

public class Lambda111{

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		powerCal lm = (x,y)->Math.pow(x,y);
		double result = lm.power(3, 3);
		System.out.println(result);
		

	}

}
