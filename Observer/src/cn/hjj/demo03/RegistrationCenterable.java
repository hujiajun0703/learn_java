package cn.hjj.demo03;

/**
 * 注册配送中心接口
 *
 */
public interface RegistrationCenterable {
	//注册牛奶工厂，返回工厂注册编号
	void registerFactory(MilkFactory milkFactory);
	//移除工厂
	void removeFactory(String factoryId);
	//接收工厂生产的牛奶
	void receiveMilk(Milk milk);
	//用户订牛奶
	void subscribeMilk(Subscribe subscribe,String factoryId);
	//用户不定牛奶了
	void cancelSubscribe(Subscribe subscribe);
	//送牛奶
	void sendMilk(Milk milk);
}
