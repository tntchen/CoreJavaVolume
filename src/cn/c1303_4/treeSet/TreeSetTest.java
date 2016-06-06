package cn.c1303_4.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 创建两个Item对象的树集:
 * 第一个按照部件编号排序(Item对象默认排序)
 * 第二个通过使用定制的比较器来按照描述信息排序
 */
public class TreeSetTest {
	public static void main(String[] args) {
		// 默认排序
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9912));
		System.out.println(parts);
		// 定制比较器,按描述信息排序
		SortedSet<Item> sortByDescription = new TreeSet<>(new Comparator<Item>() {
			@Override
			public int compare(Item a, Item b) {
				String descrA = a.getDescription();
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
		});

		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}
