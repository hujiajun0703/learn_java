package cn.hjj.demo02;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {
		WeChartServer server = new WeChartServer();
		
		Observer o1 = new User("张三");
		Observer o2 = new User("李四");
		Observer o3 = new User("王五");
		
		server.addObserver(o1);
		server.addObserver(o2);
		server.addObserver(o3);
		
		server.notifyMessage("好好学习，天天向上！");
		
		server.deleteObserver(o1);
		System.out.println("----------------------------------");
		server.notifyMessage("JAVA学习之路!");
	}
}
