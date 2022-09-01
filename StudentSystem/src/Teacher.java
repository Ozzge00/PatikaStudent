
public class Teacher {
	
String name;
String branch;

	Teacher(String name,String branch )
	{
		this.name=name;
		this.branch=branch;
	}
	
	void info()
	{
		System.out.println("Hoca Bilgisi: "+this.name+" "+this.branch);
	}
}
