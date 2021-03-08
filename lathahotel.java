
package hotel;

import java.util.Scanner;
public class Hotel 
{

    int choice;
    int i,q,u,p;
    int x, sum=0;
    int b[]=new int[10];
    int c[]=new int[12];
    String order[]=new String[15];
    String d;
   
    void accept()
    {
    do
    {
        System.out.println("****WELCOME TO RISHIK HOTEL****");
        System.out.println("Menu Display");
        System.out.println("1.Idli Vada " + "\t\t" + "35");
        System.out.println("2.Vegetable Palav" + "\t\t" + "25");
        System.out.println("3.Rava Idli" + "\t\t" + "40");
        System.out.println("4.Bisibele Bath" + "\t\t" + "30");
        System.out.println("5.Khara pongal" + "\t\t" + "30");
        System.out.println("6.Sweet Pongal" + "\t\t" + "30");
        System.out.println("7.Puri" + "\t\t" + "20");
        System.out.println("8.Masala Dosa" + "\t\t" + "40");
        System.out.println("9.coffie" + "\t\t" + "15");
        System.out.println("10.Tea " + "\t\t" + "12");
        
         Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice:");
        choice=s.nextInt();
        switch (choice)
        {
            case 1:System.out.println("Idli Vada");
                   d="Idli Vada";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=35*q;
                   break;
                
            case 2:System.out.println("Veg Palav");
                   d="Veg Palav";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=25*q;
                   break;
                
            case 3:System.out.println("Rava Idli");
                   d="Rava Idli";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=40*q;
                   break;
            case 4:System.out.println("BisibeleBath");
                    d="BisibeleBath";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=30*q;
                   break; 
            case 5:System.out.println("Khara Pongal");
                    d="Khara Pongal";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=30*q;
                   break;
            case 6:System.out.println("Sweet Pongal");
            d="Sweet Pongal";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=30*q;
                   break;
             case 7:System.out.println("puri");
                     d="Puri";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=20*q;
                   break;
             case 8:System.out.println("MasalaDosa");
                    d="MasalaDosa";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=40*q;
                   break;
            case 9:System.out.println("Coffee");
                    d="Coffee";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=15*q;
                   break;
            case 10:System.out.println("Tea");
                     d="Tea";
                   System.out.println("Enter Quantity");
                   q=s.nextInt();
                   x=12*q;
                   break;
            
            case 11:
                break;
            default: System.out.println("invalid choice");
        }
        
         System.out.println("do you want to continue 1 for yes 0 for no");
         u=s.nextInt();
        
         
       
    }while(u==1);
    System.out.println("Item name"+"\t"+"Quantity"+"\t"+"Prize");
     b[i]=q;
        c[i]=x;
        order[i]=d;
        i++;
        sum=sum+x;
    for( p=0; p<i; p++)
    
    {
             System.out.println(order[p]+"\t"+b[p]+"\t"+c[p]);
    }
    
    
    System.out.println("bill is"+sum);
    System.out.println("******THANK YOU************");

    }    
    
public static void main(String[] args) 
{
       
        Hotel d=new Hotel();
        d.accept();
}
}
        

  