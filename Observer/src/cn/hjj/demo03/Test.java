package cn.hjj.demo03;


public class Test {
	public static void main(String[] args) {
		//创建牛奶配送站
		SendMilkStation station = new SendMilkStation();
		//创建工厂
		MilkFactory aFactory = new AMilkFactory();
		MilkFactory bFactory = new BMilkFactory();
		//工厂注册
		station.registerFactory(aFactory);
		station.registerFactory(bFactory);
		//创建订阅者
		Subscribe s1 = new User("张三");
		Subscribe s2 = new User("李四");
		Subscribe s3 = new User("王五");
		Subscribe s4 = new User("李六");
		Subscribe s5 = new User("小七");
		//订阅者订阅
		station.subscribeMilk(s1, aFactory.getFactoryId());
		station.subscribeMilk(s2, aFactory.getFactoryId());
		station.subscribeMilk(s3, aFactory.getFactoryId());
		station.subscribeMilk(s4, bFactory.getFactoryId());
		station.subscribeMilk(s5, bFactory.getFactoryId());
		//送奶站收到牛奶，开始配送
		station.receiveMilk(aFactory.productionMilk());
		station.receiveMilk(bFactory.productionMilk());
		
		System.out.println("--------------------");
		
		station.cancelSubscribe(s1);
		station.cancelSubscribe(s5);
		
		station.receiveMilk(aFactory.productionMilk());
		station.receiveMilk(bFactory.productionMilk());
	}
}
