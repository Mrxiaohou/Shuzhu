package jingchengAndxiancheng;

public class text4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("c"+i);
		}
	}

}
