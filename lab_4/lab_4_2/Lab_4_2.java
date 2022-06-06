import java.util.*;
abstract class Shape
	{
		public abstract void draw();
	}

class Rectangle extends Shape
	{
		@Override
		public void draw()
			{
				System.out.println("----------");
				for(int i=0; i<8 ; i++)
					{
						System.out.printf("-%s8-%n");
					}
				System.out.println("----------");
			}
		@Override
		public String toString() {return "This is a rectangle";}
	}
class Circle extends Shape
	{
		@Override
		public void draw()
			{
				int x;
				int size_precision = 30;
				for(int i=1; i<size_precision ; i++)
					{
						x = (int)(Math.sin(i*3.14/size_precision)*size_precision);
						for (int j = 0; j<(size_precision-x)/2; j++) System.out.print(" ");
						for (int j = 0; j<x; j++) System.out.print("-");
						System.out.println();
					}
			}
		@Override
		public String toString() {return "This is a circle";}
	}

class Test
	{
		public <T extends Shape> void accept_and_print(List<T> shape_list)
			{
				for(T shape: shape_list) System.out.println(shape);
			}

		public static void main(String[] args)
			{
				Test tester = new Test();
				ArrayList<Shape> shape_list = new ArrayList<Shape>();
				shape_list.add(new Circle());shape_list.add(new Rectangle());
				tester.<Shape>accept_and_print(shape_list);
				Circle circle = new Circle();circle.draw();
			}	
	}