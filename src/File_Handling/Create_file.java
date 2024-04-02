package File_Handling;

import java.io.File;
import java.io.IOException;


public class Create_file
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D://FileHandlingTest//CoreJavaHandling.exe");
		if(f1.createNewFile())
		{
			System.out.println(" File is created ");
			
		}
		else
		{
			System.out.println("File is not created as file already exist");
			
		}
		
	}

}
