import java.io.*;


public class CopyDataThread81{
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("D:\\Users\\makaran\\Desktop\\in.txt");
		FileOutputStream os = new FileOutputStream("D:\\Users\\makaran\\Desktop\\out.txt");
		
		char c;
		int i=10;
		while(fis.available()>0)
		{
			c = (char)fis.read();
			os.write(c);
			i--;
			
			if(i==0)
			{
				i=10;
				System.out.println("10 characters read!");
				Thread.sleep(5000);
				System.out.println("Thread woke up");
			}
		}
		
		fis.close();
		os.close();
	}
}