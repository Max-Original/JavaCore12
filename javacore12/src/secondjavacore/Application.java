package secondjavacore;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {


	enum Seasons {

		WINTER, SUMMER, SPRING, AUTUMN;
	}

//inserted month information in to enum months
	enum Months {

		JANUARY(31, Seasons.WINTER), FEBRUARY(29, Seasons.WINTER), MARCH(31, Seasons.SPRING),

		APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER),

		JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER), SEPTEMBER(30, Seasons.AUTUMN),

		OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN), DECEMBER(31, Seasons.WINTER);

		Integer days;
		Seasons season;

		Months(Integer days, Seasons season) {
			this.days = days;
			this.season = season;
		}

		public Integer getDays() {
			return days;
		}

		public Seasons getS() {
			return season;
		}
	}

	static void menu() {

		System.out.println("Натисніть 1 щоб перевірити наявність місяця ");
		System.out.println("Натисніть 2 щоб вивести місяці з одної пори року");
		System.out.println("Натисніть 3 щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4 щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5 щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6 щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7 щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8 щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9 щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10 щоб вивести на екран чи введений з консолі місяць має парну кількість днів");

	}

	public static void main(String[] args) throws secondjavacore.WrongInputConsoleParametersException {

		List<Months> month = new ArrayList<>();

		month.add(Months.JANUARY);
		month.add(Months.FEBRUARY);
		month.add(Months.MARCH);
		month.add(Months.APRIL);
		month.add(Months.MAY);
		month.add(Months.JUNE);
		month.add(Months.JULY);
		month.add(Months.AUGUST);
		month.add(Months.SEPTEMBER);
		month.add(Months.OCTOBER);
		month.add(Months.NOVEMBER);
		month.add(Months.DECEMBER);

		List<Seasons> season = new ArrayList<>();

		season.add(Seasons.WINTER);
		season.add(Seasons.SPRING);
		season.add(Seasons.SUMMER);
		season.add(Seasons.AUTUMN);

		List<Months> amountMonths = Arrays.asList(Months.values());
		List<Seasons> amountSeasons = Arrays.asList(Seasons.values());

		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();
			switch (scanner.next()) {
			case "1": {

				System.out.println("Enter month");
				scanner = new Scanner(System.in);
				String months = scanner.next().toUpperCase();

				boolean flag = checkForMonth(amountMonths, months);
				if (!flag) {
					System.out.println("Month doesnt exit");
				}
				break;
			}
			case "2": {

				System.out.println("Enter Season");
				scanner = new Scanner(System.in);
				String Season = scanner.next().toUpperCase();

				boolean flag = sameSeason(amountMonths, Season);

				if (!flag) {
					System.out.println("Season doesnt exist");
				}
				break;
			}

			case "3": {
				System.out.println("Enter number of Days");
				scanner = new Scanner(System.in);
				int num = scanner.nextInt();

				boolean flag = compareAmountOfdays(amountMonths, num);

				if (!flag) {
					System.out.println("month with " + num + " days doesnt exist");
				}
				break;

			}

			case "4": {
				System.out.println("Enter number of Days");
				scanner = new Scanner(System.in);
				int num = scanner.nextInt();

				if (num > 33) {
					throw new WrongInputConsoleParametersException("month with " + num + " days doesnt exist");
				}

				boolean flag = lessDays(amountMonths, num);

				if (!flag) {
					System.out.println("month with " + num + " days doesnt exist");
				}
				break;
			}

			case "5": {
				System.out.println("Enter number of Days");
				scanner = new Scanner(System.in);
				int num = scanner.nextInt();

				if (num < 28) {
					throw new WrongInputConsoleParametersException("month with " + num + " days doesnt exist");
				}

				boolean flag = moreDays(amountMonths, num);
				if (!flag) {
					System.out.println("month with " + num + " days doesnt exist");
				}
				break;
			}
			case "6": {

				System.out.println("Enter Season");
				scanner = new Scanner(System.in);
				String enteredWord = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : amountSeasons) {
					if (s.name().equals(enteredWord)) {
						System.out.println("Season exists");
						flag = true;
					}
				}

				if (flag) {
					Seasons seasonObject = Seasons.valueOf(enteredWord);
					int ordinal = seasonObject.ordinal();
					System.out.println(ordinal);
					Object[] asa = amountSeasons.toArray();
					if (ordinal == asa.length - 1) {
						Object xn = amountSeasons.get(0);
						System.out.println(xn);
					} else {
						System.out.println(asa[ordinal + 1]);
					}
				}

				if (!flag) {
					System.out.println("Season " + enteredWord + " Doesnt exist");
				}
				break;
			}

			case "7": {

				System.out.println("Enter Season");
				scanner = new Scanner(System.in);
				String seasons = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : amountSeasons) {
					if (s.name().equals(seasons)) {
						System.out.println("Season exists");
						flag = true;
					}
				}
				if (flag) {
					Seasons se2 = Seasons.valueOf(seasons);
					int ordinal = se2.ordinal();
					Object[] asa = amountSeasons.toArray();

					if (se2.ordinal() == (asa.length - 1)) {
						ordinal = 2;
						System.out.println(asa[ordinal]);
					} else if (se2.ordinal() == 0) {
						ordinal = asa.length - 1;
						System.out.println(asa[ordinal]);
					} else {
						System.out.println(asa[ordinal - 1]);
					}
				}

				if (!flag) {
					System.out.println("Season " + seasons + " Doesnt exist");
				}
				break;
			}

			case "8": {

				for (Months m : amountMonths) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}
			case "9": {

				for (Months m : amountMonths) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}
				break;
			}
			case "10": {

				System.out.println("Enter month");
				scanner = new Scanner(System.in);
				String word = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : amountMonths) {
					if (m.name().equals(word)) {
						System.out.println("Місяць існує");
						flag = true;
					}
				}
				if (flag) {

					Months mo = Months.valueOf(word);

					if (mo.getDays() % 2 == 0) {
						System.out.println("Місяць " + mo + " має парну кількість днів");
					} else {
						System.out.println("Місяць " + mo + " має не парну кількість днів");
					}
				}
				if (!flag) {
					System.out.println("Month " + word + " doesnt exit");
				}
			}
			}
		}
	}

	private static boolean moreDays(List<Months> amountMonths, int num) {
		boolean flag = false;

		for (Months m : amountMonths) {
			if (m.getDays() > num) {
				flag = true;
				System.out.println(m);
			}
		}
		return flag;
	}

	private static boolean lessDays(List<Months> amountMonths, int num) {
		boolean flag = false;
		
		for (Months m : amountMonths) {
			if (m.getDays() < num) {
				flag = true;
				System.out.println(m);
			}
		}
		return flag;
	}

	private static boolean compareAmountOfdays(List<Months> amountMonths, int num) {
		boolean flag = false;

		for (Months m : amountMonths) {
			if (m.getDays() == num) {
				flag = true;
				System.out.println(m);
			}
		}
		return flag;
	}

	private static boolean sameSeason(List<Months> amountMonths, String Season) {
		boolean flag = false;

		for (Months m : amountMonths) {
			if (m.getS().name().equals(Season)) {
				flag = true;
			}
		}
		if (flag) {
			Seasons seasons = Seasons.valueOf(Season);

			for (Months se : amountMonths) {
				if (se.getS().name().equals(Season)) {
					System.out.println(se);
				}
			}
		}
		return flag;
	}
 
	private static boolean checkForMonth(List<Months> amountMonths, String months) {
		boolean flag = false;

		for (Months m : amountMonths) {
			if (m.name().equals(months)) {
				System.out.println("Month exists");
				flag = true;
			}
		}
		return flag;
	}

}
			


