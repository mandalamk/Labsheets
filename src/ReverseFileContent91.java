import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ReverseFileContent91 {

	public ReverseFileContent91() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileName filename = "in.txt";
		FileInputStream fis = new FileInputStream("D:\\Users\\makaran\\Desktop\\in.txt");
		ArrayList<Character> al = new ArrayList<Character>();
		
		char c;
		
		while(fis.available()>0)
		{
			c = (char)fis.read();
			al.add(c);
		}
		
		Collections.reverse(al);
		
		Iterator<Character> it = al.iterator();

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
		while(it.hasNext())
		{
			pw.write((char)it.next());
		}
		
		fis.close();
		pw.close();
	}
	
	

}
