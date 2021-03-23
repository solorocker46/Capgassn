package march15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		System.out.println("============Using forEach()==============");
		a.forEach(s->System.out.println(s));
		System.out.println("===========Applying filter===============");
		a.stream().filter(s -> s > 5).forEach(s->System.out.println(s));
		System.out.println("===========Using map()====================");
		a.stream().map(m->m+10).forEach(s->System.out.println(s));
	}

}
