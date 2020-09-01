package javacore12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aplication {
	
	final static Random random = new Random();

	static void menu() {

		System.out.println("Натисніть 1 щоб вивести всі дані з масиву ");
		System.out.println("Натисніть 2 щоб змінити всі поля у Авто");
	}
	
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		//Завдання 
		
		int count = 1 + (int)(Math.random()*5);
		
		int weelsize = 15 + (int)(Math.random()*8);
		
		int enginecylinders = 1 + (int) (Math.random()*15);
		
		int hp = 50 + (int) (Math.random()*950);
		
		int year = 1950 + (int) (Math.random()*70);
		
		String steeringwheelmaterial = "Alkantara";
		
		SteeringWheel steeringwheel = new SteeringWheel(weelsize, steeringwheelmaterial);
		
		Engine engine = new Engine(enginecylinders);
		
		for(int i=0; i < count; i++ ) {
			myList.add(new Auto(hp, year, steeringwheel, engine));
		}
		
		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			switch (sc.next()) {
			case "1": {
				System.out.println(myList.toString());
				break;
			}
			case "2": {
				System.out.println("Введіть цифру на яку бажаєте змінити всі значення");
				sc = new Scanner(System.in);
				int field = sc.nextInt();
				
				SteeringWheel se = new SteeringWheel(field, "Alkantara");
				
				Engine en = new Engine(field);
				
				Auto machine = new Auto(field, field, se, en);
				
				for(int i=0; i < count; i++ ) {
				Collections.fill(myList, machine);
				}
				break;
			}
			}
	}
}
}
