package test;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException
	{
	
	String ac="null";
	String cot="null";
	String cable="null";
	String wifi="null";
	String laundry="null";
	while(true)
	{
	System.out.println("1->booking    2->status  3->exit");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	List_bookedRooms obj=new List_bookedRooms();
	switch(n) {
	
	case 1:
		obj.Book(ac,cot,cable,wifi);
		break;
	case 2:
		obj.CheckStatus();
		break;
	case 3:
		obj.Exit();	
		break;
		default:
			System.out.println("Invalid Choice");	
	}
	}
}}
