package cn.c0606.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JOptionPane;
/*
 * 显示内部类的使用
 */
public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		//保持程序运行知道用户选择ok
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
//用常规间隔打印时间
class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval, boolean beep) {
		super();
		this.interval = interval;
		this.beep = beep;
	}
	//开始运行
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
	}
	//内部类
	public class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone,the time is "+ now);
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		}		
	}
}
