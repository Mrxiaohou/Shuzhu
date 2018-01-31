package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Io {
	public static void main(String[] args) throws Exception{
		//File file=new File("D:/JAVA/Java获取.txt");
//		System.out.println("文件是否存在"+file.exists());
//		System.out.println("判断是文件还是文件夹"+file.isFile());
//		System.out.println("");
		
//		InputStream is=new FileInputStream(file);
//		byte[] b=new byte[(int) file.length()];
//		is.read(b);
//		System.out.println(new String(b));
		
//		Reader reader=new FileReader(file);
//		char[] c=new char[(int) file.length()];
//		reader.read(c);
//		String str=new String(c);
//		System.out.println(c);
		
		File file=new File("D:/JAVA/Java输出.txt");
//		OutputStream os=new FileOutputStream(file,true);
//		String abcd="erwerw5525252";
//		os.write(abcd.getBytes());
//		System.out.println("完成");
		
//		Writer writer=new FileWriter(file, true);
//		writer.write("55555555555");
//		writer.close();
//		System.out.println("完成");
		Reader reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		String str=br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		reader.close();
	}
}
