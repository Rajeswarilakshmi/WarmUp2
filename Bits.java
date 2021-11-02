package WarmUp2;

public class Bits {
	public  static String stringBits(String str) {
		  int len = str.length();
		  String temp = "";
		  for (int i = 0; i < len; i = i + 2) {
		    temp += str.charAt(i);
		  }
		  return temp;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bits StringBits=new Bits();
		System.out.println(Bits.stringBits("Hello"));
		System.out.println(Bits.stringBits("Hi"));
		System.out.println(Bits.stringBits("Heeololeo"));

	}

}
