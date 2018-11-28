import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOverlap {
	 public static Date invalidDate = new Date(0);
	 public static  SimpleDateFormat dateFormat 
      = new SimpleDateFormat("dd-MM-yyyy");
	public static void isOverlap(Date[] dates)
	{
		for (int i = 0; i < (dates.length - 1); i = i + 2) {
            Date currentdate1 = dates[i];
            Date endDate1 = dates[i + 1];

            for (int j = i + 2; j < dates.length - 1; j = j + 2) {
                Date currentdate2 = dates[j];
                Date endDate2 = dates[j + 1];

                if ((currentdate1.compareTo(endDate2) <= 0)
                        && (currentdate2.compareTo(endDate1) <= 0))  {
                    System.out.println("Overlapping found:-");
                    System.out.println(currentdate1 + " " + endDate1);
                    System.out.println(currentdate2 + " " + endDate2);
                    
                    }
            }
        }
	}
	 private static  Date fromString( String spec ) {
	        try {
	            return dateFormat.parse( spec );
	        } catch( ParseException dfe ) {
	            return invalidDate;
	        }
	    }
	public static void main(String args[]) {
		Date [] dates = {
				fromString("01-09-2017"),
				fromString("05-10-2017"),
				fromString("04-10-2017"),
				fromString("08-10-2017"),
				fromString("12-12-2017"),
				fromString("18-12-2017")};
		isOverlap(dates);
	}
	
	/*
	 * Test Scenaios :
1)	For the range  (01-09-2017, 05-10-2017),(04-10-2017, 08-10-2017),(12-12-2017,18-12-2017)
           The expected behavior is shown
2)For the range  (05-10-2017,01-09-2017),( 08-10-2017,04-10-2017),(12-12-2017,18-12-2017)
           The expected behavior is shown

	 */
	 
	
}
