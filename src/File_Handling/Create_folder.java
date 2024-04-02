package File_Handling;

import java.io.File;

public class Create_folder 
{
	public static void main(String[] args) 
	{

		File f1= new File("D://FileHandlingTest");

		if(f1.mkdirs())
		{
			System.out.println("Folder is created ");
			
		}
		else
		{
			System.out.println("Folder is not created as folder is already present ");
			
		}
		
	}

}

