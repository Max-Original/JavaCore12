package thirdjavacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		MyArrayList<Object> myFirstList = new MyArrayList<>();
		
		while(true) {
			System.out.println("press 1 to add something to array"
					+ "\npress 2 to delete by Index"
					+ "\npress 3 to see amount of array");
			Scanner scanner = new Scanner(System.in);
			
			switch (scanner.next()) {
			case "1":{
				System.out.println("Enter anything");
				scanner = new Scanner(System.in);
				String something = scanner.next();
				myFirstList.add(something);
			}
				
				break;

			case"2":{
				System.out.println("Enter index to be deleted");
				scanner = new Scanner(System.in);
				int indexOfPerson = scanner.nextInt();
				myFirstList.remove(indexOfPerson);
			}
				break;
			case "3": {
				myFirstList.show();
			}
		}

	}
	}
}
