package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
		public static void main(String[] args) throws IOException {
			File f= new File("C:\\Users\\j43\\Documents\\demo.txt");
			FileReader fr= new FileReader(f);
			BufferedReader bf= new BufferedReader(fr);
			String s;
			boolean ch;
			while((s= bf.readLine()) != null)
			{
				ch= bf.ready();
				System.out.println(s);
				System.out.println("mark supported: "+bf.markSupported());
			bf.skip(2);
			System.out.println("Read "+ch);
			}	
				bf.close();
				fr.close();
			}
}
