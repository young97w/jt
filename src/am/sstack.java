package am;

public class sstack {

	public static void main(String[] args) {
		FixedStack mystack1=new FixedStack(4);
		for(int i=0;i<5;i++) mystack1.push(i);
		System.out.print("Stack in mystack1: ");
		for(int i=0;i<5;i++) System.out.print(mystack1.pop()+"");
			
	}

}
interface IntStack{
	void push(int item);
	int pop();
}
class FixedStack implements IntStack{
	private int stck[];
	private int pos;
	public FixedStack(int size) {
		stck=new int[size];
		pos=-1;
	}
	public int pop() {
		try {
			return stck[pos--];
		}
		catch(Exception e) {
			System.out.print("Stack is underflow.");
			return -1;
		}/*
		if(pos<0) {System.out.print("Stack is underflow.");
		return -1;}
		else return stck[pos--];*/
	}
	public void push(int item) {
		if(pos==stck.length-1) {System.out.print("Stack is full.");}
		else stck[++pos]=item;
	}
	
}
