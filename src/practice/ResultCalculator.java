package practice;

import java.util.Scanner;

public class ResultCalculator {

	public static void main(String[] args) {

	    System.out.println("Enter Student Name");
		Scanner sc = new Scanner(System.in);
		String studentName = sc.nextLine();
		
		System.out.println("Enter Roll No");
		int rollNo = sc.nextInt();
		
		double totalMark;
	   
		int subject1Mark , subject2Mark , subject3Mark , subject4Mark , subject5Mark;
	   while(true) {
		 System.out.println("Enter marks for 5 subjects (each out of 20)");
		 subject1Mark = sc.nextInt();
		 subject2Mark = sc.nextInt();
		 subject3Mark = sc.nextInt();
		 subject4Mark = sc.nextInt();
		 subject5Mark = sc.nextInt();
		
		if(subject1Mark > 20 || subject2Mark > 20 ||subject3Mark > 20 || subject4Mark > 20 || subject5Mark > 20) {
			
			System.out.println("Enter Valid Marks");	
		} else {
			break;
			 
		}
		
	   }	
	   
		 totalMark = subject1Mark + subject2Mark + subject3Mark + subject4Mark + subject5Mark;
		 System.out.println(" Student Name : " + studentName );
		System.out.println(" Roll No. : " + rollNo);
		 System.out.println(" TotalMark : " + totalMark);
	
	     char grade;
	     if(subject1Mark <7 || subject2Mark < 7 || subject3Mark < 7 || subject4Mark < 7 || subject5Mark <7) {
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
	     String remark;
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
			remark = "Invalid";
			System.out.println("Study Hard");
		}
       System.out.println(" Grade : " + grade);
       System.out.println(" Remark : " + remark);
    
	}

	

}
