package jingchengAndxiancheng;

public class text1 {
	public static void main(String[] args) {
		Thread t2=new text2();
		Thread t3=new text3();
		Runnable r=new text4();
		Thread t4=new Thread(r);
		t2.start();
		t3.start();
		t4.start();
	}
}
