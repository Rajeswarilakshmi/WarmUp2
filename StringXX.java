package WarmUp2;

public class StringXX {
	public  static String stringX(String str) {
		  String result = "";
		  int len = str.length();
		  for (int i = 0; i < len; i++){
		    char temp = str.charAt(i);
		    if (!(i > 0 && i < len - 1 && temp == 'x'))
		      result = result + temp;
		  }
		    return result;     
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringXX stringX=new StringXX();
		System.out.println(StringXX.stringX("xxHxix"));
		System.out.println(StringXX.stringX("abxxxcd"));
		System.out.println(StringXX.stringX("xabxxxcdx"));

	}

}
