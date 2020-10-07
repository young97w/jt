package am;

public class trrry {

	public static void main(String[] args) {
		int k;
		try {
			k = Integer.parseInt("12.3");
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		finally {
			k=0;
			//System.out.println("一定要执行的块");
		}
	    //System.out.print("k="+k);
	}

}
