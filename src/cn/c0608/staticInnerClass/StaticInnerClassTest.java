package cn.c0608.staticInnerClass;

import java.lang.reflect.Array;

/*
 * 演示静态内部类的使用
 */
public class StaticInnerClassTest {
	public static void main(String[] args) {
		double[] d = new double[20];
		for (int i = 0; i < d.length; i++) {
			d[i] = 100 * Math.random();
		}
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println("min= "+ p.getFirst());
		System.out.println("max= "+ p.getSecond());
	}
}

class ArrayAlg {
	public static class Pair {
		private double first;
		private double second;
		//构造方法
		public Pair(double first, double second) {
			super();
			this.first = first;
			this.second = second;
		}
		public double getFirst() {
			return first;
		}
		public double getSecond() {
			return second;
		}
	}
	public static Pair minmax(double[] values) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (double d : values) {
			if (min > d) min = d;
			if (max < d) max = d;
		}
		return new Pair(min, max);
	}
}