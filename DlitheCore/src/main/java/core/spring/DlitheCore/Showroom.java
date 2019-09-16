package core.spring.DlitheCore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Showroom implements InitializingBean, DisposableBean
{
	private Furniture furniture1,furniture2,furniture3;

	public Furniture getFurniture1() {
		return furniture1;
	}

	public void setFurniture1(Furniture furniture1) {
		this.furniture1 = furniture1;
	}

	public Furniture getFurniture2() {
		return furniture2;
	}

	public void setFurniture2(Furniture furniture2) {
		this.furniture2 = furniture2;
	}

	public Furniture getFurniture3() {
		return furniture3;
	}

	public void setFurniture3(Furniture furniture3) {
		this.furniture3 = furniture3;
	}

	@Override
	public String toString() {
		return "Showroom [furniture1=" + furniture1.toString() + ", furniture2=" + furniture2.toString() + ", furniture3=" + furniture3.toString() + "]";
	}

	public Showroom(Furniture furniture1, Furniture furniture2, Furniture furniture3) {
		super();
		this.furniture1 = furniture1;
		this.furniture2 = furniture2;
		this.furniture3 = furniture3;
	}

	public Showroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Everything sold out");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Showroom ready to sale furniture");
	}
}
