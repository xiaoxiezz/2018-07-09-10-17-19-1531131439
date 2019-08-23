package practice07;
import practice07.Person;

public class Teacher extends Person{
	private int klass;
	
	public String Teacher(String name, int age, int klass){
		super(name,age);
		this.klass=klass;
	}
}
