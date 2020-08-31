package FILE_SYSTEM_AND_DIRECTORY;
import java.io.File;
import java.io.IOException;

public class getting_Into_the_directory_roots {
			public static void main(String[] args) throws IOException
			{
				// gives all file names present in that directory
				File [] d = File.listRoots();
				// print the list of the directories present
				System.out.println("following are the disks");
				for(File dr : d)
				{
					
					System.out.println(dr);
				}
			}
}
