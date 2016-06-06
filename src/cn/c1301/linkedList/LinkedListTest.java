package cn.c1301.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 程序演示LinkedList操作
 */
public class LinkedListTest {
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");
		
		List<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		//merger the words from b to a
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while (bIter.hasNext()) {
			if (aIter.hasNext()) {
				aIter.next();
			}
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		bIter = b.iterator();
		while (bIter.hasNext()) {
			bIter.next();//跳过一个元素
			if (bIter.hasNext()) {
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(b);
		
		a.removeAll(b);
		
		System.out.println(a);
	}
}
