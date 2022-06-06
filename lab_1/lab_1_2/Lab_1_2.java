class Lab_1_2
	{

		public static boolean is_integer(String candidate_int)
			{
				try 
					{
						int number = Integer.parseInt(candidate_int);
						return true;
					}
				catch (Exception e)
					{
						return false;
					}
			}
		public static void main(String args[])
			{
				if (args.length == 0) System.out.println("you gave no args. Shame on you!");
				else
					{
						if (is_integer(args[0])) 
							{
								int number = Integer.parseInt(args[0]);
								if (number > 10) System.out.println("your number: (" + number +")  is greater than 10, good for you");
								else if (number < 10) System.out.println("your number: (" + number +")  is less than 10, good for you");
								else System.out.println("Woaaaaaah, your number is exactly 10! Nobody cares");
							}
						else
							{
								System.out.println("you didn't enter a number and I hate you");
							}

					}
			}

	}