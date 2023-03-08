package Assignments;

import java.util.Arrays;

public class Uni {
	
	private String Name;
	private String Country;
	private String Date;
	private String courses[];
	
	
	public Uni(String Name,String Country, String Date)
	{
		this.Country=Country;
		this.Date=Date;
		this.Name=Name;
		this.courses=courses;
		
					
	}


	public String getName() {
		System.out.println(Name);
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCountry() {
		System.out.println(Country);
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String getDate() {
		System.out.println(Date);
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String[] getCourses() {
		
		return courses;
	}


	public String[] setCourses(String String1,String String2) {
		System.out.println(Arrays.toString(courses));
		return courses;
	}


	
	
	
	
	

	
	


}
