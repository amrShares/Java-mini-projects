/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Lab_2_2{
   public static void main(String args[]) {
      Pattern p = Pattern.compile("J(ava)");
      String candidateString = "This is Java. This is a Java example. Java Java";
      Matcher matcher = p.matcher(candidateString);
      int numberOfGroups = matcher.groupCount();
      System.out.println("numberOfGroups =" + numberOfGroups);
   }
}
*/

import java.util.StringTokenizer;
class Lab_2_2
	{

		public static void main(String[] args)
			{

				String sentence = "Given a sentence and a word, your task is that to count the number of occurrences of the given word in the string and print the number of occurrence of the word";
				String word = "word";
				
				/*
				String temp_sentence = sentence;
				int count = 0;
				int first_occurence = temp_sentence.indexOf(word);
				while (first_occurence != -1)
					{
						count++;
						temp_sentence = temp_sentence.substring(first_occurence+1);
						first_occurence = temp_sentence.indexOf(word);
					}
				System.out.println(count);
				*/

				/*
				String[] splits = (" " + sentence+" ").split(word);
				System.out.println(splits.length-1);
				*/

				/*
				String temp_sentence = sentence;
				int count = 0;
				String regex = "(.*)" + word + "(.*)";

				while (temp_sentence.matches(regex))
					{
						count++;
						temp_sentence = temp_sentence.substring(temp_sentence.indexOf(word)+1);
					}
				System.out.println(count);
				*/

				
				int count = 0;
				StringTokenizer token_getter = new StringTokenizer(sentence);
				while (token_getter.hasMoreTokens())
					{
						
						//String token = token_getter.nextToken();
						//if(token.contains(word)) {System.out.println(word + " " + token + " : "+ "match");count++;}
						//else System.out.println(word + " and " + token + " are: "+ "not match");
						
						if(token_getter.nextToken().contains(word)) count++;
					}
				System.out.println(count);
				
			}

	}