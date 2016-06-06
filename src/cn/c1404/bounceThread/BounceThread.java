package cn.c1404.bounceThread;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 显示一个 活泼的弹球
 */
public class BounceThread {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new BounceFrame();
				frame.setTitle("BounceThread");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * 创建弹球的线程
 */
class BallRunnable implements Runnable {
	private Ball ball;
	private Component comp;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	//构建线程
	public BallRunnable(Ball aBall, Component aComponent) {
		super();
		this.ball = aBall;
		this.comp = aComponent;
	}
	@Override
	public void run() {
		try {
			for (int i = 1; i <= STEPS; i++) {
				ball.move(comp.getBounds());
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	
}

/**
 * 求组件和按钮的框架
 */
class BounceFrame extends JFrame {
	private BallComponent comp;
	/**
	 * 用展示球的组件和开始结束按钮来组成框架
	 */
	public BounceFrame() {
		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();
			}
		});
		
		addButton(buttonPanel, "Close", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(buttonPanel,BorderLayout.SOUTH);
		pack();
	}
	
	/**
	 * 给容器增加一个按钮
	 */
	public void addButton(Container c, String title, ActionListener litsener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(litsener);
	}
	/**
	 * 给弹球增加面板,让它弹一千次
	 */
	public void addBall() {
			Ball ball = new Ball();
			comp.add(ball);
			Runnable r = new BallRunnable(ball, comp);
			new Thread(r).start();
	}
}
