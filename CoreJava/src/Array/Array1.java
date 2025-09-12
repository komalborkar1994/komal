package Array;

import java.lang.reflect.AnnotatedArrayType;

import com.kk.controllers.ReverseNumber;

public class Array1 {
	
	public static void main(String[] args) {
		
//		Object[] heteroArray= {11,12,13,14,15,16};
//		System.out.println(heteroArray[4]);

//		int[]rollno= {11,12,13,14,15};
//   
//    for(int i=0;i<rollno.length;i++)
//{
//	System.out.println(rollno[i]);
//		syso("--------------------------------")
//}

//			System.out.println("---------reverse no----------------------");
//		int[]rollno= {11,12,13,14,15};
//		for(int i=rollno.length-1;i>=0;i--)
//		{
//			System.out.println(rollno[i]);
//			
//		}
		
		System.out.println("----------oddno find------------");
		int[] rollno = { 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < rollno.length; i++)
			if ((rollno[i]) % 2 != 0) {
				System.out.println(rollno[i]);
			
	}
	}
}

