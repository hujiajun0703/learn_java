package cn.hjj.demo01;

public class User implements Observer{
	private String name;
	private String message;
	
	
	public User(String name) {
		super();
		this.name = name;
	}


	@Override
	public void update(String message) {
		this.message = message;
		read();
	}

	public void read() {
		System.out.println(this.name+"收到推送消息："+this.message);
	}
}
