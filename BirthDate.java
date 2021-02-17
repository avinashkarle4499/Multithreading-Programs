package day16Multithreading;

import java.time.LocalDate;
import java.time.Period;

public class BirthDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1996, 10, 23);

		Period period = Period.between(birthDay, today);
		System.out.println(period.getYears() +" year "+ period.getMonths() +"day "+period.getDays());

	}

}