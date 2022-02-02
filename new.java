import java.util.*;
class hello{
	hello(int a,int b){
		System.out.print("Hello");
		System.out.println(a*b);
	}
}
class test{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a");
		a=input.nextInt();
		System.out.println("Enter b");
		b=input.nextInt();
		hello hi=new hello(a,b);
	}
}