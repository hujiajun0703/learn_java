package cn.hjj.demo01;

import java.util.List;

/**
 * 观察者接口
 *
 */
public interface ObserverInterface {
	//注册添加一个观察者
	void registerObserver(Observer... o);
	//删除观察者
	void removeObserver(Observer o);
	//通知观察者方法
	void notifyObserver();
}
