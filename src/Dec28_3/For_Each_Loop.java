package Dec28_3;

public class For_Each_Loop {

	public static void main(String[] args) {
		//string week days in array variable
		String week[]= {"mon","tue","wed","thu","fri","sat","sun"};
		System.out.println(week[6]);
		for(String x:week)
		{
			System.out.println(x);
		}
	}

}
