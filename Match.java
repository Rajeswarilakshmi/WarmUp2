package WarmUp2;

public class Match {
	public  static int stringMatch(String a, String b) {
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  for (int i = 0; i < len-1; i++){
		    String aSub = a.substring(i, i+2);
		    String bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub))
		      count++; 
		  }
		  return count;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match stringMatch=new Match();
		System.out.println(Match.stringMatch("xxcaazz", "xxbaaz"));
		System.out.println(Match.stringMatch("abc", "abc"));
		System.out.println(Match.stringMatch("abc", "axc"));

	}

}
