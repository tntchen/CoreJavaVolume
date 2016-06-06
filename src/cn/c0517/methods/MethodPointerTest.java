package cn.c0517.methods;

import java.lang.reflect.Method;

/*
 * 程序展示如何通过反射调用方法
 */
public class MethodPointerTest {
	public static void main(String[] args) throws Exception {
		//获得平方和开方方法指针
		Method square = MethodPointerTest.class.getMethod("square", double.class);
		Method sqrt = Math.class.getMethod("sqrt", double.class);
		
		//打印x-y表格
		printTable(1, 10, 10, square);
		printTable(1, 10, 10, sqrt);
	}
	
	/*
	 * 返回数的平方
	 */
	public static double square(double x) {
		return x * x;
	}
	
	/*
	 * 为方法打印一个x-y的表格
	 */
	public static void printTable(double from,double to,int n,Method f) {
		//打印方法表头
		System.out.println(f);
		
		double dx = (to - from) / (n - 1);
		
		for (double x = from; x <= to; x += dx) {
			try {
				double y = (Double) f.invoke(null, x);
				System.out.printf("%10.4f | %10.4f%n",x,y);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
