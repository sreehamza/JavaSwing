package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class List_bookedRooms {
	int room=0;
	String ac2;
	String cot3;
	String cable4;
	String wifi5;
	String laundry6;
	static int arr[]=new int[25];
	private Scanner s;
void Book(String ac2,String cot3,String cable4,String wifi5) throws IOException {
	
	for(int i=0;i<25;i++)
	{
	arr[i]=0;
	}
	int cost=0;
	String c;
	this.ac2= ac2;
	this.cot3= cot3;
	this.cable4= cable4;
	this.wifi5= wifi5;
	this.laundry6= laundry6;
	System.out.println("Booking:");
	do
	{
	cost=0;
	System.out.println("Please choose the services required.");
	System.out.println("AC/non-AC(AC/nAC)");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	ac2=in.readLine();
	if(ac2.equals("AC"))
	{
	cost=cost+1000;
	}
	else
	{
	cost=cost+750;
	}
	System.out.println("Cot(Single/Double)");
	cot3=in.readLine();
	if(cot3.equals("Single"))
	{
	cost=cost+0;
	}
	else
	{
	cost=cost+350;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable4=in.readLine();
	if(cable4.equals("C"))
	{
	cost=cost+50;
	cable4="cable";
	}
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi5=in.readLine();
	if(wifi5.equals("W"))
	{
	cost=cost+200;
	wifi5="wifi";
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry6=in.readLine();
	if(laundry6.equals("L"))
	{
	cost=cost+100;
	laundry6="laundry";
	}
	System.out.println("\nThe total charge is Rs." +cost);
	System.out.println("The services chosen are");
	System.out.println(cot3+" cot "+ac2+ " room");
	System.out.println(cable4+" enabled");
	System.out.println(wifi5+" enabled");
	System.out.println("with " + laundry6+ " service");
	System.out.println("Do you want to proceed?(yes/no)");
	c=in.readLine();
	}
	while(c.equals("no"));
	System.out.println("Thank you for booking. Your room number is "+ ++room);
	arr[room-1]=1;
	}
void CheckStatus() {
	s = new Scanner(System.in);
	System.out.println("Enter the room number");
	int a=s.nextInt();
	if(arr[a-1]==1) {
		System.out.println("The room number is reserved");
	}
	else {
		
		System.out.println("The room number is not reserved");
	}
	
}
void Exit() {
	System.exit(0);
}
}


