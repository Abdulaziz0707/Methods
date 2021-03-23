//created Scanner so you can add whatever number you want
import java.util.Scanner;
//Just remember to divide the diameter by two to get the radius. If you were asked to find the radius 
//instead of the diameter, you would simply divide 7 feet by 2 because the radius is one-half the measure of the diameter
public class Methods {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		  System.out.println("enter the radius : ");
		  double Radius = input.nextInt();
		//calling method  
		  GetDiameter(Radius);
	}
      // i like making my method void the most of the time for shorting time
	static void GetDiameter(double num){
	  double diameter = num*2;
	  System.out.println("the diameter of your circle is  : "+ diameter);  
  }

}
