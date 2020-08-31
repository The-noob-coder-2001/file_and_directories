package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;

public class CreationOfNewFile 
{
	public static void main(String[] args) throws IOException 
	{	
		// creating a new object of File Class
		File f = new File("input.txt");
		/* Creates a File according to the name given
		 * and returns True: If the file is created
		 * and returns False: If the file is already present
		 * */
		if(f.createNewFile()==true)
		{
		
		System.out.println("New File Created at\n"+f.getCanonicalPath());
		}
		else
		{
			System.out.println("File Already present in \n"+ f.getCanonicalPath());
		}
		
		
	}
	
}
