package WarmUp2;

public class Yak {
	public  static String stringYak(String str) {
		  String result = "";
		  for (int i=0; i<str.length(); i++) {
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else {
		      result = result + str.charAt(i);
		    }
		  }
		  return result;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yak stringYak=new Yak();
		System.out.println(Yak.stringYak("yakpak"));
		System.out.println(Yak.stringYak("pakyak"));
		System.out.println(Yak.stringYak("yak123ya") );
	}

}
