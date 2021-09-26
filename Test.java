/**
*Description: Learning Java Runtime
*@author	xd.hu
*@version	1.0
*/

public class Test 
{

	/**
	* Program Entrance
	*/
	public static void main(String[] args) 
	{

		//Integer Test
		byte binval1 = (byte)0B11101001;
		int  intval1 = 0B11101001;
		long lngval1 = 0B11101001111010011110100111101001;
		long lngval2 = 0B11101001111010011110100111101001L;

		System.out.println(binval1);
		System.out.println(intval1);
		System.out.println(lngval1);
		System.out.println(lngval2);

		int octval1 = 07777;
		int hexval1 = 0xffff;
		int hexval2 = 0xfff;

		System.out.println(octval1);
		System.out.println(hexval1);
		System.out.println(hexval2);

		if (octval1 == hexval2) 
		{
			System.out.println("07777 = 0xfff");
		}

		char enterChar = '\r';
		char ch = '\u9999';
		char cnChar = '胡';
		int intCnChar = cnChar;
		System.out.println(enterChar);
		System.out.println(ch);
		System.out.println(intCnChar);

		float af = 3.141592653589793f;
		double ad = 3.141592653589793;
		System.out.println(af);
		System.out.println(ad);
		double a = 0.0;
		double c = Double.POSITIVE_INFINITY;
		float d = Float.POSITIVE_INFINITY;
		System.out.println(a / a);
		System.out.println(c == d);
		System.out.println(a / a == Float.NaN);
		System.out.println(6.0 / a == c);
		System.out.println(-8 / a);

		int bval1 = 0B1000_0000_0000_0000_0000_0000_0000_0001;
		double pi = 3.14_15_92_65_36;
		System.out.println(bval1);
		System.out.println(pi);
		double montHeight = 8_8_4_8.23;
		System.out.println(montHeight);

		char x = 97;
		String str = 97 + "Hello!";
		System.out.println(4 + 97 + "Hello!");
		System.out.println(x + 4 + "Hello!");
		System.out.println("Hello!" + 4 + 97);
		System.out.println(x + str);
		System.out.println('\u0097' + str == x + str);

		char acapchar = 'A';
		int aintchar = (int)acapchar;
		System.out.println(aintchar);

		double d1 = 6.7;
		double d2 = 3.3;
		System.out.println(d1 % d2);

		int b1 = -5;
		String str_b1 = Integer.toBinaryString(b1);
		System.out.println(str_b1);
		System.out.println(Integer.toBinaryString(b1 << 2));
		System.out.println(Integer.toBinaryString(b1 >> 2));
		System.out.println(Integer.toBinaryString(b1 >>> 2));
		System.out.println(b1);

		//Array Test
		Object[] objArray1 = new String[5];
		objArray1[0] = "Math";
		objArray1[1] = "Physics";
		for (int i = 0; i < objArray1.length; i++) 
		{
			if (i == 3) 
			{
				objArray1[i] = "Chinese";	
			}
			System.out.println(objArray1[i]);
		}
		System.out.println(objArray1[3]);

		for (Object obj : objArray1)
		{

			System.out.println(obj);
			obj = "Computing";	
			
		}
		System.out.println(objArray1[3]);

	}
}