package Jan4;

import java.util.ArrayList;
import java.util.Iterator;

import net.bytebuddy.implementation.bind.ArgumentTypeResolver;

public class Demo {

	public static void main(String[] args) {
	ArrayList<String>str=new ArrayList<String>();
	str.add("mon");
	str.add("tue");
	str.add("wed");
	str.add("thu");
	str.add("fri");
	str.add("sat");
	str.add("sun");
	System.out.println(str.get(3));
	Iterator<String>X=str.iterator();
	while (X.hasNext()) {
		System.out.println(X.next());
		
	}
		
	}
	

	}


