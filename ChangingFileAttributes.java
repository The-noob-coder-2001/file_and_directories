package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;
public class ChangingFileAttributes {
		public static void main(String[] args) throws IOException
		{
			// create new File Object
			File f = new File("sample.txt");
			// create a file
			boolean s = f.createNewFile();
			if(s==true)
				System.out.println("New File Created");
			else
				System.out.println("File already available");
			
			//check that, File created can be writable or not?
			if(f.canWrite()==true)
					System.out.println("file can be written");
			else
				System.out.println("file cant be written");
			
			//change the attribute of the file to read-only
			f.setReadOnly();
			
			System.out.println("\nattribute of the file changed:>\n");
			
			//check that, File created can be writable or not?
			if(f.canWrite()==true)
					System.out.println("file can be written");
			else
				System.out.println("file cant be written");
			
			
		}
}
