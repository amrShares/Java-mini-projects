/*
import java.util.function.BiPredicate;
public class Lab_3_2
	{
		public static Double[] get_roots(double a, double b,double c, BiPredicate<Double,Double> root_existance)
			{
				if (root_existance.test(b, a*c) && a != 0)
					{
						return new Double[] {(-b + Math.sqrt(b*b - 4 *a*c))/(2*a), (-b - Math.sqrt(b*b - 4 *a*c))/(2*a)};
					}
				else return new Double[] {Double.NaN, Double.NaN};
			}
		
		public static void main(String[] args)
			{
				double a =1, b = -4, c = 2;
				BiPredicate<Double,Double> root_existance = new RootExistance();
				Double[] roots = get_roots(a, b, c, root_existance);
				System.out.println("roots are: " + roots[0]+ " , " + roots[1]);
			}
	}

class RootExistance implements BiPredicate<Double, Double>
	{
		public boolean test(Double b, Double ac)
			{
				return (b*b -(4*ac))>=0;
			}
	}
*/
/*
public class Lab_3_2
	{

		
		public static void main(String[] args)
			{
				double a =1, b = -3, c = 2;
				Equation quadratic = new Quadratic();
				double[] roots = quadratic.roots(new double[] {a, b, c});
				System.out.println("roots are: " + roots[0]+ " , " + roots[1]);
			}
	}

interface Equation
	{
		public double[] roots(double[] coeffs);
	}

class Quadratic implements Equation
	{
		public double[] roots(double[] coeffs)
			{
				return new double[] {(-coeffs[1] + Math.sqrt(coeffs[1]*coeffs[1] - 4 *coeffs[0]*coeffs[2]))/(2*coeffs[0]), (-coeffs[1] - Math.sqrt(coeffs[1]*coeffs[1] - 4 *coeffs[0]*coeffs[2]))/(2*coeffs[0])};
			}
	}
*/

public class Lab_3_2
	{

		
		public static void main(String[] args)
			{
				double a =1, b = -3, c = 2;
				Equation quadratic = new Quadratic(a, b, c);
				double[] roots = quadratic.roots();
				System.out.println("roots are: " + roots[0]+ " , " + roots[1]);
			}
	}

interface Equation
	{
		public double[] roots();
	}

class Quadratic implements Equation
	{
		double a, b, c;
		public Quadratic(double a, double b, double c)
			{
				this.a = a; this.b=b; this.c = c;
			}
		public double[] roots()
			{
				return new double[] {(-b + Math.sqrt(b*b - 4 *a*c))/(2*a), (-b - Math.sqrt(b*b - 4 *a*c))/(2*a)};
			}
	}
