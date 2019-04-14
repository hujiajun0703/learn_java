package cn.hjj.demo03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SendMilkStation implements RegistrationCenterable{
	//工厂列表
	private Map<String,MilkFactory> factoryTable;
	//用户列表
	private Map<String,List<Subscribe>> subscribeTable;

	
	public SendMilkStation() {
		this.factoryTable = new HashMap<String,MilkFactory>();
		this.subscribeTable = new HashMap<String,List<Subscribe>>();
	}

	@Override
	public void registerFactory(MilkFactory milkFactory) {
		String factoryId = UUID.randomUUID().toString();
		milkFactory.setFactoryId(factoryId);
		factoryTable.put(factoryId, milkFactory);
	}

	@Override
	public void removeFactory(String factoryId) {
		factoryTable.remove(factoryId);
	}

	@Override
	public void receiveMilk(Milk milk) {
		sendMilk(milk);
	}

	@Override
	public void subscribeMilk(Subscribe subscribe,String factoryId) {
		List<Subscribe> list = subscribeTable.get(factoryId);
		subscribe.setfactoryId(factoryId);
		if(list==null){
			list = new ArrayList<Subscribe>();
			subscribeTable.put(factoryId, list);
		}
		list.add(subscribe);
		
	}

	@Override
	public void cancelSubscribe(Subscribe subscribe) {
		List<Subscribe> list = subscribeTable.get(subscribe.getfactoryId());
		list.remove(subscribe);
	}

	@Override
	public void sendMilk(Milk milk) {
		List<Subscribe> list = subscribeTable.get(milk.getFactoryId());
		for(Subscribe subscribe:list){
			subscribe.receiveMilk(milk);
		}
	}

}
