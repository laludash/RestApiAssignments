package sangamone.crm.com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// need to change code
@RestController
public class ReadByMonthController {

	@GetMapping("/getholidayMonth/{month}")
	public ArrayList<String> getHolidayByMonth(@PathVariable int month) throws FileNotFoundException
	{
		ArrayList<String> holidayMonth = new ArrayList<String>();
		ArrayList<String> gethday = new ArrayList<String>();
		List<Integer>mlist2=new ArrayList<>();
		String filename  = "holiday2024.txt";
		File f2 = new File(filename);
		Scanner sc2 = new Scanner(f2);
		while(sc2.hasNext())
		{
			String str = sc2.nextLine();
			holidayMonth.add(str);
			String arr[] = str.split("-");
			mlist2.add(Integer.parseInt(arr[1]));
		}
		for(int i=0; i<holidayMonth.size();i++)
		{
			if(month == mlist2.get(i))
			{
				//holidayMonth.addAll(holidayMonth);
				gethday.add(holidayMonth.get(i));
			}
				
		}
		
		
		return gethday;
		
		
	}
	
	
}
