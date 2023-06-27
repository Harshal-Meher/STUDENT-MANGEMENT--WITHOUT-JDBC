package controller;

import java.util.Scanner;

import model.Student;

public class Control {
	Student s[];

	public Control() {
		s = new Student[50];
	}

	int n = 0, k = 0;

	Scanner sc = new Scanner(System.in);

	public void Insert() {
		System.out.print("Enter the number of Student : ");
		n = Integer.parseInt(sc.nextLine());
		for (int i = k; i < n + k; i++) {
			System.out.print("Enter the Roll No : ");
			int roll = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Address : ");
			String add = sc.nextLine();
			System.out.print("Enter Paper 1  Mark :");
			double p1 = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Paper 2  Mark :");
			double p2 = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Paper 3  Mark :");
			double p3 = Double.parseDouble(sc.nextLine());
			System.out.println("......................................................|");
			s[i] = new Student();
			s[i].setRoll(roll);
			s[i].setName(name);
			s[i].setAdd(add);
			s[i].setP1(p1);
			s[i].setP2(p2);
			s[i].setP3(p3);

		}
		k = k + n;
	}

	public void Show() {
		for (int i = 0; i < k; i++) {
			System.out.println("Roll : " + s[i].getRoll());
			System.out.println("Name : " + s[i].getName());
			System.out.println("Address : " + s[i].getAdd());
			System.out.println("Paper 1 : " + s[i].getP1());
			System.out.println("Paper 2 : " + s[i].getP2());
			System.out.println("Paper 3 : " + s[i].getP3());
			double result = (s[i].getP1() + s[i].getP2() + s[i].getP3()) / 3;
			s[i].setResult(result);
			System.out.println("Result : " + s[i].getResult());
			System.out.println("......................................................|");

		}
	}

	public void Search() {
		int user = 0;
		System.out.println("Enter Roll No: ");
		int roll = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < k; i++) {
			if (s[i].getRoll() == roll) {
				System.out.println("Roll : " + s[i].getRoll());
				System.out.println("Name : " + s[i].getName());
				System.out.println("Address : " + s[i].getAdd());
				System.out.println("Paper 1 : " + s[i].getP1());
				System.out.println("Paper 2 : " + s[i].getP2());
				System.out.println("Paper 3 : " + s[i].getP3());
				System.out.println("Result : " + s[i].getResult());
				System.out.println("......................................................|");

			} else {
				user++;
			}
		}
		if (k == user) {
			System.out.println("------------------------");
			System.out.println("Student not Found ...");
			System.out.println("------------------------");

		}
	}

	public void Update() {
		int user = 0;
		System.out.println("Enter Roll No : ");
		int roll = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < k; i++) {
			if (s[i].getRoll() == roll) {
				boolean l = true;
				while (l) {
					System.out.println("Update ~");
					System.out.println("1.Name");
					System.out.println("2.Address");
					System.out.println("3.Result");
					System.out.println("0.Exit");

					System.out.println("Enter Choice : ");
					int ch = Integer.parseInt(sc.nextLine());

					switch (ch) {
					case 1:
						System.out.println("Old Name :" + s[i].getName());
						System.out.println("Enter New Name : ");
						String name = sc.nextLine();
						s[i].setName(name);
						System.out.println("Update name Succesfully...");
						System.out.println("-----------------------");
						break;
					case 2:
						System.out.println("Old Address :" + s[i].getAdd());
						System.out.println("Enter New Name : ");
						String add = sc.nextLine();
						s[i].setAdd(add);
						System.out.println("Update address Succesfully...");
						System.out.println("-----------------------");
						break;
					case 3:
						System.out.println("1.Paper-1");
						System.out.println("2.paper-2");
						System.out.println("3.paper-3");

						System.out.println("Enter Choice : ");
						int ch1 = Integer.parseInt(sc.nextLine());

						switch (ch1) {
						case 1:
							System.out.println("Old Paper 1 Mark : " + s[i].getP1());
							System.out.println("Enter New Paper 1 Mark : ");
							double p1 = Double.parseDouble(sc.nextLine());
							s[i].setP1(p1);
							System.out.println("Paper 1 Mark Update Succsfully...");
							System.out.println("-----------------------");
							break;
						case 2:
							System.out.println("Old Paper 2 Mark : " + s[i].getP2());
							System.out.println("Enter New Paper 2 Mark : ");
							double p2 = Double.parseDouble(sc.nextLine());
							s[i].setP2(p2);
							System.out.println("Paper 2 Mark Update Succsfully...");
							System.out.println("-----------------------");
							break;
						case 3:
							System.out.println("Old Paper 3 Mark : " + s[i].getP3());
							System.out.println("Enter New Paper 3 Mark : ");
							double p3 = Double.parseDouble(sc.nextLine());
							s[i].setP3(p3);
							System.out.println("Paper 3 Mark Update Succsfully...");
							System.out.println("-----------------------");
							break;
						case 0:
							l = false;
							break;
						}
					}
					break;
				}
			} else {
				user++;
			}
		}
		if (k == user) {
			System.out.println("Student not found");
		}
	}

	public void Delete() {
		int user = 0;
		System.out.println("Enter Roll No : ");
		int roll = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < k; i++) {
			if (s[i].getRoll() == roll) {
				s[i] = s[k - 1];
				k--;
				System.out.println("Delete Data ~");
				break;
			} else {
				user++;
			}
		}
		if (k == user) {
			System.out.println("Student not found ~");
		}
	}

}
