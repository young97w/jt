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
			//System.out.println("һ��Ҫִ�еĿ�");
		}
	    //System.out.print("k="+k);
	}

}
