package pm;
import java.io.*;
import java.util.Scanner;

public class throooo {

	public static void main(String[] args) {
		boolean f=true;
		while(f) {
			try {
				System.out.print("���룡");
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
			throw new Exception("������ַ�����Ϊ�գ�");
		}
		double n=0;
		try {
			n=Double.parseDouble(nStr);
		}
		catch(NumberFormatException e) {
			throw new Exception("������ַ�������ת�����֣�");
		}
		if(n<0) {
			throw new Exception("������ַ���ת�����������㣡");
		}
		return Math.sqrt(n);
	}
}