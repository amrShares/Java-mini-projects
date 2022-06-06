import java.util.function.BiPredicate;
class Lab_4_4
	{
		public static String string_compare ( String first, String second, BiPredicate<String, String> compare) 
			{
				if (compare.test(first, second)) return first;
				else return second;
			}

		public static boolean is_alpha(String candidate)
			{
				for (Character c : candidate.toCharArray())
					{
						if (!Character.isLetter(c)) return false;
					}
				return true;
			}
		public static void main(String[] args)
			{
				System.out.println(Lab_4_4.string_compare("hello", "hi", (s,t) -> s.length() > t.length()));
				System.out.println(Lab_4_4.string_compare("It's a good day",
									  "I don't like java",
									  (s,t) -> s.length() > t.length()));
				System.out.println(Lab_4_4.is_alpha("hello"));
				System.out.println(Lab_4_4.is_alpha("h2ello"));
				System.out.println(Lab_4_4.is_alpha("h ello"));
			}
	
	}