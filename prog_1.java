package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class prog_1 
{
	public static void main(String[] args) throws IOException
	{
		if(args.length==0)
		{
			System.out.println("Usage : FileStatus filename");
			System.exit(1);
		}
		
		for(String a : args)
		{
			status(a);
		}
	}
	public static void status (String filename) throws IOException
	{
		System.out.println("--"+filename+"--");
		// construct a file object for the given file
		File f = new File(filename);
		// Checks if the file actually exists?
		if(!f.exists()) {
			System.out.println("File not found");
			System.out.println(); // for blank line
			return;
		}
		//print full name of the file
		System.out.println("Canonical name "+f.getCanonicalPath());
		
		// print parent directory if possible
		String p = f.getParent();
		if(p!=null)
		{
			System.out.println("Parent Directory "+p);	
		}
		
		//Checking that the file is readable or not!
		if(f.canRead()) {
			System.out.println("File is Readable");
		}
		
		// Checking is the file is writable or not:
		if(f.canWrite())
		{
			System.out.println("File is Writable");
		}
		
		//Report on the modification time:
		Date d = new Date(f.lastModified());
		System.out.println("Last Modified "+d);
		
		
		// Check that if there is a file present or a directory is present
		if(f.isFile())
		{
			// if File is present, then show its full size:
			System.out.println("File Present with Size : "+f.length()+" bytes");
		}
		else if(f.isDirectory()) //checks that is its a directory or not.
		{
			System.out.println("Its a Directory");
		}
		else
		{
			System.out.println("I dont know whether its a Directory or a file.");
		}
		
	}
	
}
