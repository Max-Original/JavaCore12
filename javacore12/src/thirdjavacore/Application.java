package thirdjavacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		List<Person> listPersons = new ArrayList<>();
		
		while(true) {
			System.out.println("press 1 to add Person to the end of array"
					+ "\npress 2 to delete Person by Index"
					+ "\npress 3 to see amount of Persons in the array");
			Scanner scanner = new Scanner(System.in);
			
			switch (scanner.next()) {
			case "1":{
				System.out.println("Enter your name");
				scanner = new Scanner(System.in);
				String name = scanner.next();
				System.out.println("Enter your age");
				int age = scanner.nextInt();
				listPersons.add(new Person(name, age));
			}
				
				break;

			case"2":{
				System.out.println("Enter index of a person the is going to be deleted");
				scanner = new Scanner(System.in);
				int indexOfPerson = scanner.nextInt();
				
				listPersons.remove(indexOfPerson);
			}
				break;
			case "3": {
				for(int i = 0; i < listPersons.size(); i++)
					System.out.println(listPersons.get(i));
			}
			}
		}

	}

}
