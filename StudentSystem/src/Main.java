
public class Main {

	public static void main(String[] args) {
		
		Teacher t1=new Teacher("ÖZGE","MAT");
		Teacher t2=new Teacher("HAMZA","BIO");
		Teacher t3=new Teacher("AHSEN","TRH");
		t1.info();t2.info();t3.info();
		
		
		System.out.println("=================");
		Course c1=new Course("Matematik","102","MAT");
		Course c2=new Course("Biyoloji","102","BIO");
		Course c3=new Course("Tarih","101","TRH");
		c1.info();c2.info();c3.info();
		
		
		System.out.println("=================");
		Student s1=new Student("FARAH",c1,c2,c3);
		s1.verbalNote(70,50,80);
		s1.examNote(80,60,90);
		s1.info();
		s1.pass();
		Student s2=new Student("HALÝT",c1,c2,c3);
		s2.verbalNote(30,40,30);
		s2.examNote(40,50,60);
		s2.info();
		s2.pass();
		
	}

}
