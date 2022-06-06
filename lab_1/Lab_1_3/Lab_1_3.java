class Lab_1_3
	{
		public static void main(String args[])
			{
				if (args.length <= 1) System.out.println("If you give me just one or no arguments again, I'll blow ITI up\ndo YOU want me to blow iti up?\nThis program takes TWO arguments!");
				else
					{
						int number = Integer.parseInt(args[0]);
						for (int i =0; i< number; i++) System.out.println(args[1]);
						
					}
			}

	}