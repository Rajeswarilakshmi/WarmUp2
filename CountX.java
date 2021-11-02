package WarmUp2;

public class CountX {
	 static int countXX(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length()-1; i++) {
		    if (str.substring(i, i+2).equals("xx")) count++;
		  }
		  return count;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountX countXX=new CountX();
		System.out.println(CountX.countXX("abcxx"));
		System.out.println(CountX.countXX("xxx"));
		System.out.println(CountX.countXX("xxxx"));

	}

}
