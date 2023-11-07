package java_dsa;

public class StudentStack {
	String name;
	int age;
	
public StudentStack(String name, int age) {
	this.name = name;
	this.age = age;
}

//private String getName() {
//	return name;
//}
//
//private int getAge() {
//	return age;
//}
@Override
public String toString() {
	return name + " " + age;
}
}
