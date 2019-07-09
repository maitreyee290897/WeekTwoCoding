import java.io.*;
class A{
	public void abc() throws IOException,NullPointerException,ArithmeticException,UserException
	{
		int a=5;
		for(int i=1;i<=20;i++){
			System.out.println(i);
			int res=a/(a-i);
			if(i==15){
				throw new NullPointerException();
			}
			if(i==120){
				throw new IOException();
			}
			if(i==100){
				return;
			}
			if(i==80){
				throw new UserException("when i is 8");
			}
			if(i==60){
				throw new UserException("when i is 6");
			}
		}
	}
public void xyz() throws IOException,ArithmeticException,UserException
{
	abc();
}
public void atoz() throws IOException,ArithmeticException,UserException
{
	xyz();
}
}
public class ExceptionDemo
{
	public static void main(String args[])
	{
		try{
			A a1=new A();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("IOExcepton hanler...");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerExceptionHandler...");
		}
		catch(UserException e)
		{
			System.out.println("custom exception hanler...");
			e.printStackTrace();
			e.display();
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Default exception hanler...");
		}
		finally
		{
			System.out.println("THANKSS.");
		}
		System.out.println("Program continues");
	}
}

class UserException extends Exception
{
public UserException(){
}

public UserException(String msg){
super(msg);
}
public void display(){
System.out.println("just for demo");
}
}


