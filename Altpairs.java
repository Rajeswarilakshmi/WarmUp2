package WarmUp2;

public class Altpairs {
	public  static String altPairs(String str) {
		  String result = "";
		  for (int i=0; i<str.length(); i += 4) {
		    int end = i + 2;
		    if (end > str.length()) {
		      end = str.length();
		    }
		    result = result + str.substring(i, end);
		  }
		  return result;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Altpairs altPairs=new Altpairs();
		System.out.println(Altpairs.altPairs("kitten"));
		System.out.println(Altpairs.altPairs("Chocolate") );
		System.out.println(Altpairs.altPairs("CodingHorror"));

	}

}
