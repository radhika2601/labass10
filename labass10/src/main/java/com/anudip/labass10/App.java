package com.anudip.labass10;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
	public static String add(Session ss,Transaction T)
	{
		employee e=new employee();
		System.out.println("enter eid");
		Scanner sc1=new Scanner(System.in);
		int eid=sc1.nextInt();
		e.setEid(eid);
		
		System.out.println("enter ename");
		Scanner sc2=new Scanner(System.in);
		String ename=sc2.nextLine();
		e.setEname(ename);
		
		System.out.println("enter dept");
		Scanner sc3=new Scanner(System.in);
		String dept=sc3.nextLine();
		e.setDept(dept);
		
		System.out.println("enter saraly");
		Scanner sc4=new Scanner(System.in);
		int esalary=sc4.nextInt();
		e.setEsalary(esalary);
		
		
		address ad=new address();
		
		System.out.println("enter hname");
		Scanner sc5=new Scanner(System.in);
		String hname=sc5.nextLine();
		ad.setHname(hname);
		
		
		System.out.println("enter Area");
		Scanner sc6=new Scanner(System.in);
		String area=sc6.nextLine();
		ad.setArea(area);
		
		System.out.println("enter city");
		Scanner sc7=new Scanner(System.in);
		String city=sc7.nextLine();
		ad.setCity(city);
		
		
		System.out.println("enter pincode");
		Scanner sc8=new Scanner(System.in);
		int pincode=sc8.nextInt();
		ad.setPincode(pincode);
		
		
		 e.setAddress(ad);
		 ss.save(e);
		 T.commit();
		return "emp is added";
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
        SessionFactory sf=con.buildSessionFactory();
         Session ss=sf.openSession();
     	
         Transaction T=ss.beginTransaction();
         
         System.out.println(add(ss,T));
    }
}
