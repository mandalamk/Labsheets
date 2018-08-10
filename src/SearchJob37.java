import java.util.Scanner;
import java.util.regex.Pattern;


public class SearchJob37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8,}_job",s));
	}

}
