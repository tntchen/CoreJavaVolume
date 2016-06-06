package cn.c0306.BigIntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 测试BigInteger使用
 */
public class BigIntegerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("需要选几个数");
		int i = sc.nextInt();
		
		System.out.println("一共有多少数可选?");
		int j = sc.nextInt();
				
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for (int l = 1; l < i; l++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(j - l + 1).divide(BigInteger.valueOf(l)));			
		}
		System.out.println("You odds are 1 in "+ lotteryOdds +". Good Luck!");
	}
}
