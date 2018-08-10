import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadNumberScanner92 {

	public ReadNumberScanner92() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws FileNotFoundException
	{
		File file = new File("D:\\Users\\makaran\\workspace\\LabSheets\\Scanner.txt");
		Scanner sc = new Scanner(file);
		String s = sc.nextLine();
		String[] l;
		l = s.split(",");
		
		for(int i=0;i<l.length;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
		sc.close();
	}
}
