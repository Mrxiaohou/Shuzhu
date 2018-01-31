package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Io1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("E:\\asd\\笔记\\css.txt");
		//获取文件，字节法；
		InputStream in=new FileInputStream(file);
		byte[] a=new byte[(int) file.length()];
		in.read(a);
		System.out.println(new String(a));
		a.clone();
		in.close();
		//创建文件，字节法
		File file2=new File("E:/asd/笔记2/css副本.txt");
		System.out.println(file2.createNewFile());
		OutputStream out=new FileOutputStream(file2);
		out.write(a);
		out.close();
		System.out.println("O了");
		OutputStream out2=new FileOutputStream(file2,true);
		String add="dasd13215355555";
		out2.write(add.getBytes());
		out2.close();
	}

}
