import java.util.Scanner;
public class GeometryCalculator
{
public static void main (string args[])
{
 System.out.println("GeometryCalcuator\n\n1.Calculate the area of circle\n2.Calculate the area of Rectangle");
 System.out.println("3.Calculate Area of Triangle\n4Quit\n");//Menus Option
 System.out.println("Enter your Choice (1-4):");
 Scanner input=new Scanner(System.in);
 //Creating Scanner class object 
 option=input.nextint();//user input
  While (option!=4)//iterating loop till user choose 4
  {  
    switch (option)
    {
     case 1: //if user chooses 1
       double radius,pi=3.14;  //pi variable default 3.14
       System.out.print("\nEnter the Radius of Circle: ");
       radius=input.nextDouble();
       //asking user to enter radius
       System.out.println("\nThe Area of Circle is "+ pi *radius *radius + "\n");//calculate and print the area
       break;
     case 2:
       double length,width;
       System.out.print("\nEnter the rectangle's length: ");
       length=input.nextDouble();
       System.out.print("\nEnter  the retangle's width: ");
       width=input.nextDouble();//taking width and length from user 
       if (width<0)
           System.out.println("\nWidth Must be a number > 0");
       if (length<0)
           System.out.println("\nLength Must be a number > 0"); //if length or width negative display error message
       if (length>0 && width>0)
           System.out.println("\nThe area of rectangle is " + length * width +"\n")//else  print the area of rectangle
           
           System.out.println("\nThe  area of rectangle is " + length * width +"\n");//else print the area of rectangle
           break;
      case 3:
        double breadth,height;
        System.out.print("\nEnter the Breadth of Triangle : ");
        breadth=input.nextDouble();
        System.out.print("\nEnter the Height of Triangle : ");
        height=input.nextDouble();//Taking height and breadth from user 
        if (breadth<0)
          System.out.println("\nBreadth Must  be a Number > 0");
        if (height<0)
          System.out.println("\nHeight must  be  a Number > 0"); //if anything is negative error 
        if (breadth>0 && height>0)
          System.out.println("\nThe area of Triangle is " + (breadth * height)/2 +"\n");//else print the area value
         break;
      default:
        System.out.println("please Enter Correct choice\n"; //if any other option  display message
        }
        System.out.println("Geometry Calculator\n\n1.Caclculate the area of circle\n2.Calculate the area of Rectangle");
        System.out.println("3.Calculate the Area of Triangle\n4.Quit\n");
        System.out.print ("Enter your Choice (1-4):");
        option=input.nextInt();
        }
      }
    }