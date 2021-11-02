package WarmUp2;

public class Splosion {
	public  static String stringSplosion(String str) {
		  int len = str.length();
		  String temp = "";
		  for (int i = 0; i < len + 1; i++)
		    temp += str.substring(0,i);
		  return temp;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Splosion stringSplosion=new Splosion();
		System.out.println(Splosion.stringSplosion("Code"));
		System.out.println(Splosion.stringSplosion("abc"));
		System.out.println(Splosion.stringSplosion("ab"));
		

	}

}
