package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {
public static void main(String[] args) throws IOException {
	File fr=new File("C:\\Users\\j43\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\Task\\src\\testFile");
	File fw=new File("C:\\Users\\j43\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\quiz\\outputCheck");
	FileInputStream fis= new FileInputStream(fr);
	FileOutputStream fos= new FileOutputStream(fw);
	int d;
	while((d=fis.read())!=-1) {
		fos.write(d);
	}
	fis.close();
	fos.close();
}
}
