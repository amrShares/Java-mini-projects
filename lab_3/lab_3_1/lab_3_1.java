import java.util.function.Function;
/*
class Lab_3_1
	{
		public static double convert(double degree, Function<Double,Double> conversion_function)
			{
				return conversion_function.apply(degree);
			}
		
		public static void main(String[] args)
			{
				double degree_cel = 27.0;
				double degree_f = convert(degree_cel, (degree) -> degree*5/9 + 32);
				System.out.println(degree_cel + "C is : "+ degree_f + "F");
			}
	}
*/
public class Lab_3_1
	{
		public static double convert(double degree, Function<Double,Double> conversion_function)
			{
				return conversion_function.apply(degree);
			}
		
		public static void main(String[] args)
			{
				double degree_cel = 27.0;
				Function<Double,Double> convert = new Convert();
				double degree_f = convert(degree_cel, convert);
				System.out.println(degree_cel + "C is : "+ degree_f + "F");
			}
	}

class Convert implements Function<Double, Double>
	{
		public Double apply(Double degree_cel)
			{
				return degree_cel*5/9 + 32;
			}
	}

