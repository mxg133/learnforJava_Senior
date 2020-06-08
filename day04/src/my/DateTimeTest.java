package my;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 孟享广
 * @create 2020-06-08 12:58 下午
 */
public class DateTimeTest {
@Test
    public void  testSimpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();


        Date date = new Date();

        System.out.println(date);
    System.out.println(date.getTime());

    String format = sdf.format(date);
    System.out.println(format);


    System.out.println("******");

//    jiexi
    String str = "2020/6/8 下午1:04";
    Date date1 = sdf.parse(str);
    System.out.println(date1);

    //////////////////
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String format1 = sdf1.format(date);
    System.out.println(format1);

    Date date2 = sdf1.parse(format1);
    System.out.println(date2);

}

    @Test
    public void test1() throws ParseException {
        String bi = "2020-3-5";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(bi);
        System.out.println(date);


        java.sql.Date bir = new java.sql.Date(date.getTime());
        System.out.println(bir);
    }
    @Test
    public void testCalendar(){

        Calendar calendar = Calendar.getInstance();

        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

        calendar.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));



        calendar.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        Date date = calendar.getTime();
        System.out.println(date);

        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }


    @Test
    public void test2(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 12, 4, 53);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonthValue());

        LocalDateTime localDateTime2 = localDateTime1.withDayOfMonth(22);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);


    }

    @Test
    public void test3(){
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));

        System.out.println(offsetDateTime);

        System.out.println(instant.toEpochMilli());

        Instant instant1 = Instant.ofEpochMilli(1591603055316L);
    }
    @Test
    public void test4(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1  = formatter.format(localDateTime);
        System.out.println(str1);

        TemporalAccessor parse = formatter.parse("2020-06-08T16:10:37.387174");
        System.out.println(parse);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);


    }

    @Test
    public void test5(){
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);

        TemporalAccessor parse = formatter3.parse("2020-06-08 16:26:02");
        System.out.println(parse);

    }
}
