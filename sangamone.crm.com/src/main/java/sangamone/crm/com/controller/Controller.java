package sangamone.crm.com.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	
	@GetMapping("/hello")
	public String getMessage()
	{
		return "Hello World";
	}
	
	@GetMapping("/today")
	public String  getToday()
	{
		boolean isFastingDay = false;
		LocalDateTime today = LocalDateTime.now();
		String  today2 = today.getDayOfWeek().toString();
		String today1 = today.toString();
		if(today2.equals("TUESDAY"))
		{
			isFastingDay = true;
		}
		
		return today1+today2+"isFastingDay"+isFastingDay;
		//System.out.println("today"+today);
	}
	
	@GetMapping("/getHolidays/{year}")
	public List<String> getHolidayList(@PathVariable String year) throws FileNotFoundException
	{
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();
		String filename = "input2024.txt"; 
		File f1 = new File(filename);
		Scanner sc1  = new Scanner(f1);
		
		while(sc1.hasNext())
		{
			
			String str = sc1.nextLine();
			al.add(str);
			String arr[] = str.split("-");
			al2.add(arr[2]);
		}
		for(int i = 0; i <al2.size(); i++)
		{
			if(year.equals(al2.get(i)))
			{
				al3.add(al.get(i));
			}
		}
		
		
		return al3;
		
	}
	
	
	//@GetMapping("/getMonth/{month}")
	//public String getMonth(@PathVariable int month)
//	{
	//	ArrayList<String>  ob1 = new ArrayList<String>();
		
		
	//	return null;
		
//	}
	
	
	
	
}
