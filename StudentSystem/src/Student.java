
public class Student {

	String name;
	Course c1,c2,c3;
	double avrg_c1,avrg_c2,avrg_c3;
	double average;
	
	
	
	Student (String name,Course c1,Course c2,Course c3)
	{
		this.name=name;
		this.c1=c1;
		this.c2=c2;		
		this.c3=c3;
	}
	public void name(String c1,String c2,String c3) 
	{
		this.c1.name=c1;
		this.c2.name=c2;
		this.c3.name=c3;
	}
	
	
	public void verbalNote(int v_c1,int v_c2,int v_c3)
	{
		this.c1.v_note=v_c1;
		this.c2.v_note=v_c2;
		this.c3.v_note=v_c3;
		
	}
	
	public void examNote(int e_c1,int e_c2,int e_c3)
	{
		this.c1.e_note=e_c1;
		this.c2.e_note=e_c2;
		this.c3.e_note=e_c3;
		
	}
	
	public void average()
	{
		avrg_c1=this.c1.v_note*0.2+this.c1.e_note*0.8;
		avrg_c2=this.c2.v_note*0.3+this.c2.e_note*0.7;
		avrg_c3=this.c3.v_note*0.25+this.c3.e_note*0.75;
		this.average=(avrg_c1+avrg_c2+avrg_c3)/3;
	}
	
	public void pass()
	{
		
		if(this.average>60) System.out.println("Ortalama: "+this.average+" "+"GEÇTÝNÝZ!");
		else System.out.format("Ortalama: "+this.average+" "+"KALDINIZ!");
	}
	public void info()
	{
		average();
		System.out.println("Öðrenci: "+this.name);
		System.out.println("Ders: "+this.c1.name+" "+"Ortalama:"+this.avrg_c1);
		System.out.println("Ders: "+this.c2.name+" "+"Ortalama:"+this.avrg_c2);
		System.out.println("Ders: "+this.c3.name+" "+"Ortalama:"+this.avrg_c3);
		
	}
	
}
