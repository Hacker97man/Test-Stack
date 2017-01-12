import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<5;i++)
			{
			s.push(i);
			System.out.print(i+" ");
			}
		System.out.println();
		Stack<Integer>re=returnStack(s);
		while(!re.isEmpty())
			System.out.print(re.pop()+" " );
	}
	
	public static Stack<Integer>returnStack(Stack<Integer> s){
		Stack<Integer>second=new Stack<>();
			for(int i=0;i<s.size()-1;i++)
			{
				int secondNumber=s.pop();
				int firstNumber=s.pop();
				second.push(firstNumber+secondNumber);
			}
				return second;
	}

}
