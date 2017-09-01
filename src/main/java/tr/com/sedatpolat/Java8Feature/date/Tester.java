package tr.com.sedatpolat.Java8Feature.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

/**
 * 
 * @author sedpol
 *
 */
public class Tester {
	public static void main(String[] args) {
		LocalDate localDateNow = LocalDate.now();
		System.out.println("localDateNow: " + localDateNow);

		LocalDate localDateOfSomeDay = LocalDate.of(1985, 7, 25);
		System.out.println("localDateOfSomeDay: " + localDateOfSomeDay);

		System.out.println("20636 years + (64 + 148 days)" + LocalDate.ofYearDay(20636, 64 + 148));
		System.out.println("Epoch Day(17000): " + LocalDate.ofEpochDay(17000));

		System.out.println("*************");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + localDateTime);
		System.out.println("LocalDate: " + localDateTime.toLocalDate());
		System.out.println("LocalTime: " + localDateTime.toLocalTime());

		System.out.println("*************");
		
		LocalDateTime dateTime = LocalDateTime.of(localDateTime.toLocalDate(), localDateTime.toLocalTime());
		System.out.println("LocalDateTime: " + dateTime);
		
		System.out.println("*************");
		
		Instant instant = Instant.now();
		System.out.println("Instant.now(): " + instant);
		
		Instant i = Instant.ofEpochMilli(instant.toEpochMilli());
		System.out.println("Instant.ofEpochMilli: " + i);
		
		Instant ins = Instant.ofEpochMilli(System.currentTimeMillis());
		System.out.println("Instant.ofEpochMilli currentTimeMillis: " + ins);
		
		System.out.println("****************");
		
		LocalDate localDate = LocalDate.of(20636, 3, 4);
		
		localDate = localDate.plusDays(148);
		System.out.println("LocalDate.of(20636, 3, 4) plus 148 days: " + localDate);
		
		localDate = localDate.minusDays(148 + 64);
		System.out.println("LocalDate.of(20636, 3, 4) minus (148 + 64) days:" + localDate);
		
		LocalDate myBirthDay = LocalDate.of(1985, 06, 05);
		System.out.println("myBirthDay after 11000 days: " + myBirthDay.plusDays(11000));
		System.out.println(myBirthDay.with(TemporalAdjusters.firstDayOfYear()));

		System.out.println("****************");
		
		Period period = myBirthDay.until(LocalDate.now());
		System.out.println("How old am I? : " + period.getYears());
		

		System.out.println("****************");
		
		ZoneId id = TimeZone.getDefault().toZoneId();
		System.out.println("TimeZone.getDefault().toZoneId(): " + id);
		
		List<String> zoneList = Arrays.asList(TimeZone.getAvailableIDs());
		zoneList.forEach(str -> System.out.print(str + ", "));
		
	}
}
