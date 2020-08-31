package FILE_SYSTEM_AND_DIRECTORY;
/*
 * Creating a temporary file using createTempFile() method
 * and then deleting it when the program is finished
 * */
import java.io.File;
import java.io.IOException;
public class CreateATransientFile {

		public static void main(String[] args) throws IOException
		{
			File temp = File.createTempFile("bkl", "lkb");
			//specify the path of the file :
			System.out.println("Path : \n"+temp.getCanonicalPath());
			//now program will end and it will be deleted:
			temp.deleteOnExit(); // deleted the file on exit of the program
		}
}
