
public class Course {
	
	String name;
	String code;
	String prefix;
	int v_note=0;
	int e_note=0;
	double avrg=0;
	
	Course(String name,String code,String prefix)
	{
		this.name=name;
		this.code=code;
		this.prefix=prefix;
	}
	
	void info()
	{
		System.out.println("Ders Bilgisi: "+this.name+" "+this.code+" "+this.prefix);
	}
	
}
