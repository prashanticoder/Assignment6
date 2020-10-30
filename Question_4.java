import java.io.*;
import java.util.*;

public class Question_4 {
public static void main(String[] args) {
	try
	{
		Scanner file=new Scanner(new File("data.txt"));
		double lar=file.nextDouble();
	while(file.hasNextDouble())	
	{
		double no=file.nextDouble();
		if(no>lar)
		{
			lar=no;
		}
			System.out.println(no);
	}
		file.close();
		System.out.println("largest number"+lar);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
