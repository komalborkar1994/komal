package stringprogram;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String day="monday";
		System.out.println(day);
		int length=day.length();
		System.out.println(length);
		
		for(int i=0;i<=day.length()-2;i++)
		{
			Character c=day.charAt(i);
			System.out.println(day.charAt(i));
		}
		
	}

}
