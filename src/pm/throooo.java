package pm;
import java.io.*;
import java.util.Scanner;

public class throooo {

	public static void main(String[] args) {
		boolean f=true;
		while(f) {
			try {
				System.out.print("输入！");
				String s = new Scanner(System.in).nextLine();
				System.out.print(MyMath.sqrt(s));
				f=false;
				
			}
			catch(Exception e) {
				System.out.print(e.getMessage());
				f=true;
			}
		}
		

	}
	
}
class MyMath{
	public static double sqrt(String nStr) throws Exception{
		if(nStr==null) {
			throw new Exception("输入的字符不能为空！");
		}
		double n=0;
		try {
			n=Double.parseDouble(nStr);
		}
		catch(NumberFormatException e) {
			throw new Exception("输入的字符必须能转成数字！");
		}
		if(n<0) {
			throw new Exception("输入的字符串转化后必须大于零！");
		}
		return Math.sqrt(n);
	}
}