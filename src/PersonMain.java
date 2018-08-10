public class PersonMain {

		public static void main(String[] args)
		{
		
			try{	
				Person23 p = new Person23("fg","g54r",'h');
			
				System.out.print(p.getFname());
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
}
