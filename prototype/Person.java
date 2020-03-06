package prototype;

/*
 * Objects in the registry should have something in common
 * Abstract class is used that implements clonable interface and 
 * override the clone method
 * */

public abstract class Person implements Cloneable {
	private String name;
	private int age;
	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public abstract char getSexe();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
