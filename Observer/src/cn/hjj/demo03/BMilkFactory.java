package cn.hjj.demo03;

public class BMilkFactory implements MilkFactory {
	private String factoryId;

	@Override
	public Milk productionMilk() {
		Milk milk = new Milk("B牌牛奶");
		milk.setFactoryId(factoryId);
		return milk;
	}

	@Override
	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	@Override
	public String getFactoryId() {
		return factoryId;
	}

}
