package constuctor;

public class Animal {
	 String name;
	 int age;
	 public Animal(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
		 
	 }
	 public void getAnimalDetail() {
		 
		 System.out.println("Name of animal:"+name+ " , Age of animal:"+age);
		 
	 }
	
	
	
public static void main(String[] args) {
	
	Animal a=new Animal("Buzo",4);
	a.getAnimalDetail();
	
}
}
