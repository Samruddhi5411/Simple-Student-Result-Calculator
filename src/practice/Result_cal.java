package practice;

import java.util.Scanner;

public class Result_cal {

	public static void main(String[] args) {

	    System.out.println("Enter Student Name");
		Scanner sc = new Scanner(System.in);
		String studentName = sc.nextLine();
		String remark;
		System.out.println("Enter Roll No");
		int rollNo = sc.nextInt();
		
		double totalMark;
	    char grade ;
		int sub1Mark , sub2Mark , sub3Mark , sub4Mark , sub5Mark;
	   while(true) {
		 System.out.println("Enter marks for 5 subjects");
		 sub1Mark = sc.nextInt();
		 sub2Mark = sc.nextInt();
		 sub3Mark = sc.nextInt();
		 sub4Mark = sc.nextInt();
		 sub5Mark = sc.nextInt();
		
		if(sub1Mark > 20 || sub2Mark > 20 ||sub3Mark > 20 || sub4Mark > 20 || sub5Mark > 20) {
			
			System.out.println("Enter Valid Marks");	
		} else {
			break;
			 
		}
		
	   }	
	   System.out.println("Student Name : " + studentName );
		System.out.println("Roll No. : " + rollNo);
		 totalMark = sub1Mark + sub2Mark + sub3Mark + sub4Mark + sub5Mark;
		 System.out.println("TotalMark : " + totalMark);
	     double avg = totalMark / 5 ; 
	     System.out.println("Average : " + avg);
	     if(sub1Mark<7 || sub2Mark < 7 || sub3Mark < 7 || sub4Mark < 7 || sub5Mark <7 && totalMark < 40 ) {
	    	 grade = 'F';
	     }else if(totalMark >= 90 ) {
	    	 grade = 'A';
	     }else if(totalMark >=80) {
	    	 grade = 'B';
	     }else if(totalMark >=70) {
	    	 grade = 'C';
	     }else if(totalMark >=60) {
	    	 grade = 'D';
	     }else if(totalMark >=40) {
	    	 grade = 'E';
	     }else {
	    	 grade = 'F';
	    	System.out.println("Study Hard!!");
	     }
		switch(grade) {
		case 'A':
			  remark = "Excellent";
			  break;
		case 'B':
			  remark = "Very Good";
			  break;
		case 'C':
			  remark = "Good";
			  break;	  
		case 'D':
			  remark = "Average";
			  break;
		case 'E':
			  remark = "Need Improvment";
			  break;
		case 'F':
			  remark = " Fail";
			  break;	
		default :
			System.out.println("Study Hard");
		}
       
	}

	

}
