package javacore12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
	
	final static Random random = new Random();

	static void menu() {

		System.out.println("Натисніть 1 щоб вивести всі дані з масиву ");
		System.out.println("Натисніть 2 щоб змінити всі поля у Авто");
	}
	
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		//Завдання 
		
		int count = 1 + (int)(Math.random()*5);
		
		int weelSize = 15 + (int)(Math.random()*8);
		
		int engineCylinders = 1 + (int) (Math.random()*15);
		
		int hp = 50 + (int) (Math.random()*950);
		
		int year = 1950 + (int) (Math.random()*70);
		
		String steeringWheelMaterial = "Alkantara";
		
		SteeringWheel steeringWheelObject = new SteeringWheel(weelSize, steeringWheelMaterial);
		
		Engine engine = new Engine(engineCylinders);
		
		for(int i=0; i < count; i++ ) {
			myList.add(new Auto(hp, year, steeringWheelObject, engine));
		}
		
		while (true) {
			menu();
			Scanner scanner = new Scanner(System.in);
			switch (scanner.next()) {
			case "1": {
				System.out.println(myList.toString());
				break;
			}
			case "2": {
				System.out.println("Введіть цифру на яку бажаєте змінити всі значення");
				scanner = new Scanner(System.in);
				int field = scanner.nextInt();
				
				SteeringWheel steeringWheel = new SteeringWheel(field, "Alkantara");
				
				Engine motor = new Engine(field);
				
				Auto machine = new Auto(field, field, steeringWheel, motor);
				
				for(int i=0; i < count; i++ ) {
				Collections.fill(myList, machine);
				}
				break;
			}
			}
	}
}
}
