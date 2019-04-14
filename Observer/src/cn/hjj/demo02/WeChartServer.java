package cn.hjj.demo02;

import java.util.Observable;

public class WeChartServer extends Observable{
	public void notifyMessage(String message) {
		setChanged();
		System.out.println(hasChanged());
		notifyObservers(message);
	}
}
