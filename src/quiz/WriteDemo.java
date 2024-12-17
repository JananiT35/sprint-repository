package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteDemo { 
		public static void main(String[] args) throws IOException {
			String text="First file writing";
			FileWriter fw= new FileWriter("C:\\Users\\j43\\Documents\\demo.txt",true);
			double a=fw.hashCode();
			System.out.println("Finished writing  "+a);
			String b=fw.getEncoding();
			System.out.println("After encoding: "+b);
			fw.write("test");
			fw.append("line\n");
			fw.flush();
			fw.close();
}
}
