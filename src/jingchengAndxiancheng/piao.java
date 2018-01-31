package jingchengAndxiancheng;

public class piao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a=new piao1();
		Thread p1=new Thread(a);
		Thread p2=new Thread(a);
		p1.start();
		p2.start();
	}

}
