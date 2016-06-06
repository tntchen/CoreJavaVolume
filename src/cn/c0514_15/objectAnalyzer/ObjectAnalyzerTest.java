package cn.c0514_15.objectAnalyzer;

import java.util.ArrayList;

/*
 * 本程序使用反射分析对象
 */
public class ObjectAnalyzerTest {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			squares.add(i * i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}
}
