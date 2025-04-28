package comparableAndComperator;

public class Dog implements Comparable{
	private String name;
	private int age;
	
	public Dog(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Dog d=(Dog)o;
		if(this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);
		}
		return Integer.compare(this.age,d.age);

	}
	
	
}
