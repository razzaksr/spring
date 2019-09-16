package core.spring.DlitheCore;

import org.springframework.beans.factory.BeanNameAware;

public class Furniture implements BeanNameAware
{
	private String name, type, usage, pojoName;
	private int price;
	
	public Furniture() {
		// TODO Auto-generated constructor stub
	}
	public Furniture(String name, String type, String usage, int price) {
		this.name = name;
		this.type = type;
		this.usage = usage;
		this.price = price;
	}
	
	@Override
	public String toString() {
		if(pojoName.equals("fur2"))
		{return "";}
		return "Furniture:"+pojoName+" [name=" + name + ", type=" + type + ", usage=" + usage + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		pojoName=name;
	}
}
