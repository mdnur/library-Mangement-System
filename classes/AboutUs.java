package classes;

import java.io.BufferedReader;
import java.io.*;

public class AboutUs {
	public AboutUs() {
		this.show();
	}

	public void show(){
		Tools.clear();
		String text="", temp;	
		try
		{
			FileReader reader = new FileReader("classes/aboutUs.txt");
			BufferedReader bfr = new BufferedReader(reader);			
			
			while((temp = bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			} 				
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		char inChars[] = text.toCharArray();
		
		
		for(char i : inChars){
			
			System.out.print(i);
			try{
				Thread.sleep(10);
			}catch(Exception e){
				
			}
			
		}
		
		Tools.etoc();
	}
}
