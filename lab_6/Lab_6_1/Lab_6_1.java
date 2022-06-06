import java.io.*;  
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
class Lab_6_1
	{

		public static void printCharWords(Map<Character, List<String>> dictionary, Character ch)
			{
				System.out.println(dictionary.get(ch));
			}

		public static void printAllWords(Map<Character, List<String>> dictionary)
			{
				for(List<String> words: dictionary.values()) System.out.println(words);
			}
		
		public static void main(String[] args)
			{
				List<String> words = new ArrayList<String>();
				try
					{
						FileInputStream fis=new FileInputStream("words.txt");       
						Scanner sc=new Scanner(fis); 
						while(sc.hasNextLine()) words.add(sc.nextLine()); 
						sc.close();
					}
				catch(Exception e)
					{
						System.out.println("no such file exists");
					}
				Map<Character, List<String>> dictionary = words.stream()
									.sorted()
									.collect(Collectors.groupingBy( (s) -> s.charAt(0) ));

				//printCharWords(dictionary, 'z');
				printAllWords(dictionary);			
			}
	
	}