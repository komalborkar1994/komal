package constructors;

import java.awt.Color;

public class Animal {
	public void getName() {
		String name="buzo";
		System.out.println(name);
	}
	public void getAge(int age)
	{
		age=34;
		System.out.println(age);
	}
	
	
public static void main(String[] args) {
	Animal animal=new Animal();

	animal.getAge(12);
	animal.getName();
	

}
}
