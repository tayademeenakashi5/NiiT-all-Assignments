import java.util.Scanner;
class PhLevelAnalyser{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phLevel");
		int ph = sc.nextInt();
		if(ph>=0 && ph<=7)
		{
			System.out.println("pH value is low");
		}
		else if (ph>=7 && ph<=8)
		{
			System.out.println("pH value is fine");
		}
		else if (ph>=8 && ph<=14)
		{
			System.out.println("pH value is high, partial water change required.");
		}
	    else
		{
			System.out.println("plese enter correct value");
		}	
		

	}
	
}

