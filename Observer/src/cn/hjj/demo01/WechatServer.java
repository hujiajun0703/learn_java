package cn.hjj.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了ObserverInterface接口，对ObserverInterface接口的三个方法进行了具体实现
 *
 */
public class WechatServer implements ObserverInterface{
	
	//观察者列表
	private List<Observer> list;
	//通知消息
	private String message;
	
	
	public WechatServer() {
		this.list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer... o) {
		for(Observer observer:o){
			list.add(observer);
		}
	}
	
	@Override
	public void removeObserver(Observer o) {
		if(!this.list.isEmpty()){
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:list){
			observer.update(message);
		}
	}

	public void setMessage(String message) {
		this.message = message;
		//通知所有观察者消息更新
		notifyObserver();
	}

}
