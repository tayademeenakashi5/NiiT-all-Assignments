class PizzaOrder{
public static void main(String[] args) {
System.out.println("-------------------------");
	System.out.println("Customer Details");
    System.out.println("-------------------------");
    String CustomerName ="Gary";
	String CustomerEmail ="gary@123.com";
	long PhoneNo = 412312345L ;
		String address = "20. Marble Drive,Eville";
		int noofPizzasOrdered = 5;
        float pizzaPrice = 12.5f;
        char pizzasize = 'M';
        int noofGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99f;
        int noOfBeveragesOrdered =3;
        float beveragePrice = 1.99f;

	   float tpo =noofPizzasOrdered*pizzaPrice;
       float tgo = noofGarlicBreadOrdered*garlicBreadPrice;
       float tbo =noOfBeveragesOrdered*beveragePrice;
       
       
       float totalbill=tpo+tgo+tbo;
       
    
       boolean totalPrice =  (totalbill>=100); 
        
       int discountpercent=10;
       float totaldiscountvalueforbill=discountpercent*totalbill/100;
       float totalbillamounttobepaid=totalbill-totaldiscountvalueforbill;
	
		System.out.println("The Name :" +CustomerName);
		System.out.println("The email :" +CustomerEmail);
		System.out.println("The number :" +PhoneNo);
		System.out.println("The address :" +address);
	   
      

		System.out.println("-------------------------");
		System.out.println("Order Summary");
		System.out.println("-------------------------");

		System.out.println(" ");
        System.out.println("Sr no.    ItemName      ItemQuantity    $UnitPrice   $TotalPrize");
		System.out.println("----------------------------------------------------------------------");   
        System.out.println(" 1       pizza             5           12.5         62.5");
		System.out.println(" 2       Garlic Bread      3           5.99         17.97");
		System.out.println(" 3       Beverages         3           3.99         5.9788885");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Total Bill Amount : $"+totalbill);
        System.out.println("Discount Offered  : "+discountpercent+"%");
        System.out.println("Amount to pe paid : $"+totalbillamounttobepaid);
		System.out.println("-----------Thank You------------------");
	
       
		
        


       


		
		
	}
    

    
}


