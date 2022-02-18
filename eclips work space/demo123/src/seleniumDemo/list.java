package seleniumDemo;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
	List<String> l = new ArrayList();
	l.add("1");
	l.add("0");
	l.add("5");
	System.out.println(l);
	
for (int i = 0; 0 < l.size(); i++) {
		String d = l.get(i);
		if (d.equals("5")) {
			l.remove(i);
			System.out.println(l);
}
		
	
}
	


}

}


