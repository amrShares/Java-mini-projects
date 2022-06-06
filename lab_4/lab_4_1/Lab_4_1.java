/*
 Create your own exception class and write down two other
classes, the first will contain three methods throwing your
newly created exception class and the second class will be
calling the methods that throws exception using the try-catchfinally block.
*/
import java.io.IOException;
class MyException extends IOException
	{
		public MyException()
			{
				super();
			}
		public MyException(String message)
			{
				super(message);
			}
	}
class Thrower
	{
		public void smaller_than_ten(int x) throws MyException
			{
				if (x < 10) System.out.println("your integer is less than 10, which is good");
				if (x == 10) System.out.println("you are at the verge of an exception, take care");
				else throw new MyException("you exceeded 10! In a smaller than 10 function!");
			}
		public void bigger_than_ten(int x) throws MyException
			{
				if (x > 10) System.out.println("your integer is bigger than 10, which is good");
				if (x == 10) System.out.println("you are at the verge of an exception, take care");
				else throw new MyException("your integer is less than 10! In a bigger than 10 function!");
			}
		public void is_ten(int x) throws MyException
			{
				if (x > 10) System.out.println("your integer is bigger than 10, which is good");
				if (x < 10) System.out.println("your integer is less than 10, which is good");
				else throw new MyException("your integer Is 10! How dare you!");
			}
	}
class Catcher
	{
		public static void main(String[] args)
			{

				if (args.length != 1) System.out.println("please give a single argument the next time you call this program, OR ELSE ):");
				else
					{
						if (!args[0].matches("\\d+")) {System.out.println("a single NUMERICAL argument goddamit!");return;}
						int argument = Integer.parseInt(args[0]);
						Thrower thrower = new Thrower();
						try
							{
								thrower.bigger_than_ten(argument);
							}
						catch (MyException e)
							{
								System.out.println(e.getMessage());
							}
						try
							{
								thrower.smaller_than_ten(argument);
							}
						catch (MyException e)
							{
								System.out.println(e.getMessage());
							}
						try
							{
								thrower.is_ten(argument);
							}
						catch (MyException e)
							{
								System.out.println(e.getMessage());
							}
						finally
							{
								System.out.println("Why are we here? Just to suffer");
							}
					}
			}
	}