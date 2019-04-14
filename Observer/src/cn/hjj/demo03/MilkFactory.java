package cn.hjj.demo03;

public interface MilkFactory {
	Milk productionMilk();
	void setFactoryId(String factoryId);
	String getFactoryId();
}
