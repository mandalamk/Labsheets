import java.util.HashMap;
import java.util.Map;


public class NumberAndSquares74 {

	public NumberAndSquares74() {
		// TODO Auto-generated constructor stub
	}

	public HashMap<Integer,Integer> mathstuff(int[] arr)
	{
		HashMap<Integer,Integer> mymap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			mymap.put(arr[i], arr[i]*arr[i]);
		}
		return mymap;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		

	}

}
