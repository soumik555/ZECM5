package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class File_writer 
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D://FileHandlingTest//CoreJavaHandling.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("Hello my name is Soumik \n");
		fw.flush();
		fw.write("This is just for testing purpose \n");
		fw.flush();
		
	
		
		
		
		
				
		
		
	}

}
