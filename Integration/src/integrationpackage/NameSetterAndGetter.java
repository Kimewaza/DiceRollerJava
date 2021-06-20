package integrationpackage;
//John Nguyen


public class NameGetterAndSetter {
	private String name;
	private String month;
	private String day;
	private String year;
	
	public NameGetterAndSetter(String n, String m, String d, String y) {
		name = n;
		month = m;
		day = d;
		year = y;
		System.out.println("Hello " + n + "\n Its " + m + " - " + d + " - "+ y + ".");
	}
	
}
