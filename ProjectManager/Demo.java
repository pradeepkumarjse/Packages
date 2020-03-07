//package pack1;
import p1.A;
import p1.B;
import p2.D;
public class Demo{
	public static void main(String[] args){
	   A a1=new  A();       
	  System.out.println(a1.i);
      a1.m1();


 B b=new  B();
System.out.println(b.j);
b.m2();

 p2.A a2=new  p2.A();
System.out.println(a2.x);
a2.m3(); 

 D d=new  D();
System.out.println(d.y);
d.m4();



		
	}

	
	
}