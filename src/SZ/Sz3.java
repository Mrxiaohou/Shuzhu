package SZ;

import java.util.ArrayList;
import java.util.List;

public class Sz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(555);
		list.add("a");
		list.add(5);
		list.add(6);
		list.add(1,"sdasdasd");
		list.add(1,"ÎÒÊÇ1ºÅÎ»");
		list.remove(2);
		for(Object i:list) {
			System.out.println(i);
		}
	}

}
