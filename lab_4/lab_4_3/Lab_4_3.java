import java.math.*;
class Complex<T extends Number>
	{
		T real, imag;
		public Complex(T real, T imag)
			{
				this.real = real;
				this.imag = imag;
			}
		public Complex add(Complex number)
				{
					return new Complex(this.real.doubleValue() + number.real.doubleValue(),
							   this.imag.doubleValue() + number.imag.doubleValue());
				}
		public Complex subtract(Complex number)
				{
					return new Complex(this.real.doubleValue() - number.real.doubleValue(),
							   this.imag.doubleValue() - number.imag.doubleValue());
				}
		public Complex multiply(Complex number)
				{

					Double real = this.real.doubleValue() * number.real.doubleValue() - number.imag.doubleValue() * number.imag.doubleValue();
					Double imag = this.imag.doubleValue() * number.real.doubleValue() + this.real.doubleValue() * number.imag.doubleValue();
					return new Complex(real, imag);
				}
		public Complex divide(Complex number)
				{
					
					Double divider = number.real.doubleValue() * number.real.doubleValue() + number.imag.doubleValue() * number.imag.doubleValue();

					Double real = this.real.doubleValue() * number.real.doubleValue() + number.imag.doubleValue() * number.imag.doubleValue();
					Double imag = this.imag.doubleValue() * number.real.doubleValue() - this.real.doubleValue() * number.imag.doubleValue();
					return new Complex(real.doubleValue() / divider, imag.doubleValue()/ divider);
				}
		@Override
		//public String toString() {return (this.real + "").concat( this.imag.compareTo(new BigDecimal(0)) > 0 ? "+i" + this.imag : "-i" + this.imag.abs() );}
		public String toString() {return this.real + "+i" + this.imag;}
	}

class Lab_4_3
	{


		public static void main(String[] args)
			{
				Complex<Double> x = new Complex<Double>(new Double(1), new Double(3.5));
				Complex<Double> y = new Complex<Double>(new Double(2), new Double(0));
				
				System.out.println("x is " + x);
				System.out.println("y is " + y);
				System.out.println("x+y is "+ x.add(y));
				System.out.println("x-y is "+ x.subtract(y));
				System.out.println("x*y is "+ x.multiply(y));
				System.out.println("x/y is "+ x.divide(y));
			}
	}