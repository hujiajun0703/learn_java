package cn.hjj.demo03;

public class User implements Subscribe{
	private String name;
	private String factoryId;
	public User(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getfactoryId() {
		return factoryId;
	}
	public void setfactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	@Override
	public void receiveMilk(Milk milk) {
		System.out.println(this.name+"收到"+milk.getName()+"!");
	}
	
}
