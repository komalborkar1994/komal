package overriding;


public class Tiger extends Animal
	{
		//constructor chaining
		public Tiger() {
			this(23);
		}
		
		public Tiger(int a) {
			System.out.println("a in constructor is : " + a);
			
		}
		
		public int number = 123;
		
		public void printColor() {
			System.out.println("Yello black stripped");
		}
		
		public void something() {
			System.out.println("Something method");
			System.out.println(this.number);
			this.printColor();
			this.printName();
			
		}
		
		@Override
		public void printName() {
			// TODO Auto-generated method stub
			System.out.println("print name - LION");
		}
		

		

	}


