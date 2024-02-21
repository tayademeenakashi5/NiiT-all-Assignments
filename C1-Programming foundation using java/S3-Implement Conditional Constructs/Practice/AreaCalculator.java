import java.util.Scanner;
class AreaCalculator {
    public static void main(String[]args)	{
    Scanner sc = new Scanner(System.in);
	double side,radius,length,width,area;
	System.out.println("Select an option from list to calculate area of  fence");
	System.out.println("1. Square area for the chickens");
	System.out.println("2. Circular  radius for the ducks");
	System.out.println("3. Rectangular area for the cows");
	int Calculator = sc.nextInt();
    
	switch(Calculator)
	{
      case 1:
      System.out.println("Enter side of square");
      side = sc.nextDouble();
	  area= side*side;
      System.out.println("Area of square fence for chickens is :"+area);
	  break;
      case 2:
      System.out.println("Enter radius of circle");
	  radius = sc.nextDouble();
	  area=3.14*radius*radius;
	  System.out.println("Area of circular fence for ducks is :"+area);
	  break;
	  case 3:
	  System.out.println("Enter length and width of rectangle");
	  length = sc.nextDouble();
	  width = sc.nextDouble();
	  area=length*width;
	  System.out.println("Area of rectangular fence for cows is :" +area);
	  break;
	  default:
	  System.out.println("Enter correct value 1,2,3");


	
	}
	}
}

