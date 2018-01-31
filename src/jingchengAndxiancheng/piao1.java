package jingchengAndxiancheng;

public class piao1 implements Runnable {
	Object cc=new Object();
	int i=20;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(i>0) {
			synchronized (cc) {
				if(i>0) {
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"µÚ¼¸ÕÅÆ±"+i);
					i--;
				}
			
		}
		}
	}

}
