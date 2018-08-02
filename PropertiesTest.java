import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	
	public static void main(String[] args) {
		String key;
		
		Properties employeesEducation = new Properties();
		employeesEducation.put("Nawaz", "BSCS");
		employeesEducation.put("Sajid Ali", "M.Sc Electrical Engineering");
		employeesEducation.put("Luqman", "B.Sc Electrical Engineering");
		employeesEducation.put("Shahbaz Yasin", "M.Sc Electrical Engineering");
		employeesEducation.put("Rehmat", "FA");
		employeesEducation.put("Rizwan", "B.Sc Electrical Engineering");
		
		Set employees = employeesEducation.keySet();
		Iterator i = employees.iterator();
		while(i.hasNext()) {
			 key = (String) i.next();
			System.out.println(key + " has Degree of : "+ employeesEducation.getProperty(key));
		}
		
		System.out.println("***********************************");
		Properties systemProperties = System.getProperties();
		Set sysProperty = systemProperties.keySet();
		Iterator it = sysProperty.iterator();
		while(it.hasNext()) {
			key = (String) it.next();
			System.out.println(key + " is : " + systemProperties.getProperty(key));
		}
		
		
	}

}
