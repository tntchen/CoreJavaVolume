package cn.c0516.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 程序演示泛型数组的反射的使用
 */
public class CopyOfTest {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		a = (int[]) goodCopyOf(a,10);
		System.out.println(Arrays.toString(a));
		String[] b = {"Tom","Dick","Harry"};
		b = (String[]) goodCopyOf(b, 10);
		System.out.println(Arrays.toString(b));
		
		System.out.println("The following call will generate an exception.");
		b = (String[]) badCopyOf(b, 10);
	}
	
	/*
	 * 此方法尝试通过分配一个新数组和复制所有元素来增加数组
	 */
	public static Object[] badCopyOf(Object[] a,int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
		return newArray;
	}
	
	/*
	 * 此方法通过分配一个相同类型的数组和复制所有元素来增加数组
	 */
	public static Object goodCopyOf(Object a,int newLength) {
		Class cl = a.getClass();
		if (!cl.isArray()) {
			return null;
		}
		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
}
