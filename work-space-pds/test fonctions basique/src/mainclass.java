
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class mainclass {

	public static void main(String[] args) {
		
//		System.out.println(System.currentTimeMillis());
//		
//		System.out.println(new java.util.Date().getTime());
//	
//	System.out.println(Calendar.getlnstance().getTimelnMillis() );
////
////		TimeZone simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy").getTimeZone();
////		System.out.println(((DateFormat) simpleDateFormat).format(22/15/1992));
		LocalDate a;
	
		System.out.println(LocalDate.now());
		
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());

		System.out.println(timeStamp);
		//api.openweathermap.org/data/2.5/forecast?id=524901&APPID=1111111111;
	
	}

}
