package view;

import java.util.Scanner;

import controller.Control;

public class Views {

	public static void main(String[] args) {

		System.out.println("* Student Mangemnet System - Without JDBC");
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		Control c = new Control();

		while (loop) {
			try{
			System.out.println("1.Insert");
			System.out.println("2.Show");
			System.out.println("3.Search");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("0.Exit");
			System.out.println("------------------------------");
			System.out.print("Enter Choice : ");
			int ch = Integer.parseInt(sc.nextLine());
			System.out.println("......................................................|");

			switch (ch) {
			case 1:
				c.Insert();
				break;
			case 2:
				c.Show();
				break;
			case 3:
				c.Search();
				break;
			case 4:
				c.Update();
				break;
			case 5:
				c.Delete();
				break;
			case 0:
				loop = false;
				break;
			}
			}
			catch (Exception e) 
			{
		     System.out.println("---------------");
             System.out.println("Error :-"+e);
             System.out.println("---------------");
			}
			}
		
	}

}
