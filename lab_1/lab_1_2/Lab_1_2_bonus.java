class Lab_1_2
	{

		public static boolean is_float(String candidate_float)
			{
				try 
					{
						double number = Double.parseDouble(candidate_float);
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
						if (is_float(args[0])) 
							{
								double float_number = Double.parseDouble(args[0]);
								int integer_number = (int)float_number;
								if (float_number == integer_number)
									{
										int number = integer_number;
										if (number > 10) System.out.println("your number: (" + number +")  is greater than 10, good for you");
										else if (number < 10) System.out.println("your number: (" + number +")  is less than 10, good for you");
										else System.out.println("Woaaaaaah, your number is exactly 10! Nobody cares");
									}
								else 
									{
										System.out.println("you gave a float, not an integer. Trying to be smart aren't you");
									}
							}
						else
							{
								System.out.println("you didn't enter a number and I hate you");
							}

					}
			}

	}