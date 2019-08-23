package practice07;
import practice07.Person;
import practice07.Klass;;

public class Teacher extends Person{
	private Klass klass;

	public Teacher(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	@Override
	public String introduce() {
		return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", this.getName(), this.getAge(), klass.getNumber());
}
}
 
