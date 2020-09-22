
public class BibleBook 
{
	
	
		private String name;
		private int chapters; 
		private String description;
		
		public BibleBook(String name, int chapters, String description)
		{
			this.name = name;
			this.chapters = chapters; 
			this.description = description; 
		}
		
		public void display()
		{
			System.out.println(this.name + ", " + this .chapters + "  (description: " + this.description + ")");
		}
}

