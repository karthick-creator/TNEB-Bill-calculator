import java.util.Scanner;

public class TNEB_Bill {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Number of units consumed"); 
		  int units = sc.nextInt();
		  double pay =0;
		 
		  if(units<=500)
		  {
			  if(units<=100)
			  {
				  pay = 0;
			  }
			  else if(units<=200)
			  {
				  pay = (units-100)*2.25;
			  }
			  else if(units<=400)
			  {
				  pay = 225+(units-200)*4.5;
			  }
			  else if(units<=500)
			  {
				  pay = (100)*2.25+(200)*4.5+(units-400)*6;
			  }
			  System.out.println("Total amount to pay "+pay);
		  }
		  else
		  {
			  if(units<=100)
			  {
				  pay = 0;
			  }
			  else if(units<=400)
			  {
				  pay = (units-100)*4.5;
			  }
			  else if(units<=500)
			  {
				  pay = (300*4.5)+(units-400)*6;
			  }
			  else if(units<=600)
			  {
				  pay = (300)*4.5+(100)*6+(units-500)*8;
			  }
			  else if(units<=800)
			  {
				  pay = (300)*4.5+(100)*6+(100)*8+(units-600)*9;
			  }
			  else if(units<=1000)
			  {
				  pay = (300)*4.5+(100)*6+(100)*8+(200)*9+(units-800)*10;
			  }
			  else
			  {
				  pay = (300)*4.5+(100)*6+(100)*8+(200)*9+(200)*10+(units-1000)*11;
			  }
			  System.out.println("Total amount to pay "+pay);
		  }
	}

}
