package cn.hjj.demo01;

public class Test {
	public static void main(String[] args) {
		WechatServer server = new WechatServer();
		
		Observer o1 = new User("张三");
		Observer o2 = new User("李四");
		Observer o3 = new User("王五");
		
		server.registerObserver(o1,o2,o3);
		
		server.setMessage("好好学习，天天向上！");
		
		System.out.println("----------------------------------");
		
		server.removeObserver(o1);
		
		server.setMessage("JAVA学习之路！");
	}
}
