package pm;

public class throwex {

	public static void main(String[] args) {
		
		System.out.print(divid(4,2));

	}
	static int divid(int x,int y) throws Exception{
		int res=x/y;
		return res;
	}

}
