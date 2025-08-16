import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
	       l.add(5);
	       l.add(10);
	       l.add(15);
	       l.add(10);
	       l.add(20);
	       System.out.println(l);
	       HashMap<Integer, Integer> map = new HashMap<>();
	       
	       for(int num: l) {
	           map.put(num, map.getOrDefault(num,0)+1);
	       }
	       List<Integer> ele = new ArrayList<>();
	       for(int num: l) {
	           if(map.get(num) == 1){
	               ele.add(num);
	               break;
	           }
	       }
	       
	       System.out.println(ele);

	}

}
