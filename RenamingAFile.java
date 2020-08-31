package FILE_SYSTEM_AND_DIRECTORY;

/*Problem : we need to change the file name on the disk
 * Sol: Use renameTo() method from java.io.File class's object
 * */
import java.io.File;
import java.io.IOException;
public class RenamingAFile {
public static void main(String[] args) throws IOException 
{
	// created a File Object and named a file input.txt for renaming
	File f = new File("file2rename.txt");
	//f.createNewFile();
	if(f.createNewFile()==true)
	{
		System.out.println("new file is created");
	}
	else
	{
		System.out.println("file already is available");
	}
	f.renameTo(new File("just.txt"));
	System.out.println("After rename file name is "+f.getName());
	
}
}
