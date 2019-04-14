package cn.hjj.demo02;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	private String name;
	private Object message;
	
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object message) {
		this.message = message;
		read();
	}
	private void read() {
		System.out.println(this.name+"收到推送消息："+this.message);
	}

}
