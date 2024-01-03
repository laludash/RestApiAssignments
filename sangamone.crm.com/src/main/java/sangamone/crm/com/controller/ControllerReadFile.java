package sangamone.crm.com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerReadFile {

	@GetMapping("/getHolidayList")
	public List<String> getHolidayList1() throws FileNotFoundException
	{
		ArrayList<String> holidaylist = new ArrayList<String>();
		//ArrayList<String> holidaylist3  = new ArrayList<String>();
		String filename = "input2024.txt";
		File f1 = new File(filename);
		Scanner sc1 = new Scanner(f1);
		
		while(sc1.hasNext())
		{
			String str1 = sc1.nextLine();
			holidaylist.add(str1);
			
		}
		
		return holidaylist;
		
	}
	
//	@GetMapping("/getHoliday/{month}")
///	public void getHolidayList2(int month) {
		// write code here.
	//}
//	@GetMapping("/getHoliday/{month}")
//	public void getHolidayList3(String month) {
		// write code here.
//	}
//	@GetMapping("/getHolidayFuture")
	//public void getHolidayFuture() {
		// write code here
	//}
	//@GetMapping("/getHolidayPast")
//	public void getHolidayPast() {
		// write code here
//	}
	
	
}
