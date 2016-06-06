package cn.c1302.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 程序演示使用输入打印所有单词,迭代器实现,hashset存储
 */
public class SetTest {
	public static void main(String[] args) throws IOException {
		Set<String> words = new HashSet<>();
		long totalTime = 0;
		
		FileInputStream inputStream = new FileInputStream("E:\\test\\SocketDemo.txt");
		Scanner in = new Scanner(inputStream);
		while (in.hasNext()) {
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
		}
		
		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++) {
			System.out.println(iter.next());
		}
		System.out.println("...");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds");
	}
}
