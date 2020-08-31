package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;

public class ListingAllFilesPresentinaDirectory {
		public static void main(String[] args) throws IOException
		{ 
			//creating a directory array:
			String d[] = new java.io.File(".").list();
///			Arrays.sort(d);
		}
}
