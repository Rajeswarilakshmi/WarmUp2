package WarmUp2;

public class Front {
	public  static String frontTimes(String str, int n) {
	  int len = str.length();
	  String temp = "";
	  if (len < 4) {
	    for (int i = 0; i < n; i++) {
	      temp += str;
	    }
	  } else {
	      for (int j = 0; j < n; j++) {
	        temp += str.substring(0,3);
	      }
	  }
	  return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front frontTimes=new Front();
		System.out.println(Front.frontTimes("Chocolate", 2) );
		System.out.println(Front.frontTimes("Chocolate", 3) );
		System.out.println(Front.frontTimes("Abc", 3));

	}

}
