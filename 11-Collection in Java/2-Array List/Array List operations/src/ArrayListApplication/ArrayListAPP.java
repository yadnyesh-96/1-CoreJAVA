package ArrayListApplication;

import java.util.*;

public class ArrayListAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		do {
			System.out.println("1.Add the element");
			System.out.println("2.View the element");
			System.out.println("3.Search element in array list");
			System.out.println("4.delete element in array list");
			System.out.println("5.Check the size of Array List");
			System.out.println("6.Exit");

			System.out.println("Enter the choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value:");
				int val = sc.nextInt();
				boolean b = al.add(val);
				if (b) {
					System.out.println("Value added Successfully !");
				} else {
					System.out.println("Value is not added ?");
				}
				break;
			case 2:
				for (Object obj : al) {
					System.out.println(obj);
				}
				break;

			case 3:
				System.out.println("Enter the data:");
				int data = sc.nextInt();
				b = al.contains(data);
				if (b) {
					System.out.println("Data is Found");
				} else {
					System.out.println("Data not Found !");
				}
				break;

			case 4:
				System.out.println("Enter data for delete:");
				data = sc.nextInt();
				int index = al.indexOf(data);
				if (index != -1) {
					al.remove(index);
					System.out.println("Data Deleted");
				} else {
					System.out.println("Data is not found");
				}
				break;

			case 5:
				int size = al.size();
				System.out.println("Size of array list is :" + size);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Choice");
			}

		} while (true);
	}

}
