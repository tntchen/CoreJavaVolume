package cn.c0307.LotteryDrawing;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 演示数组的各种操作
 */
public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("你打算选几个数");
		int k = sc.nextInt();
		
		System.out.println("你有几个数可以挑选");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			//创建一个0~n-1的随机数
			int r = (int) (Math.random() * n);
			result[i] = numbers[r];
			//将最后的元素加入随机区域,把已选的数据覆盖掉,防止重复
			numbers[r] = numbers[n-1];
			n--;
		}
		
		Arrays.sort(result);
		System.out.println("中奖号码:");
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
