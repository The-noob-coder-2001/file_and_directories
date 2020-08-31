package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;

public class DeletingAfile {
		public static void main(String[] args) throws IOException
		{
			File f = new File("Delete.txt"); // creating of the new file Object
			f.createNewFile(); // creating the File
			// now deleting it:
			if(f.delete())
			{
				System.out.println("File Deleted");
			}
			else
			{
				System.out.println("File is not deleted");
			}
		}
}
