package codesoft;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Welcome to Grade Calculator******");
		System.out.println("Enter your name");
		String name=sc.next();
		
		int subject=0;
		System.out.println("Enter  number of subjects");
		subject=sc.nextInt();
		int [] marks=new int[subject];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter mark"+(i+1)+"=");
			marks[i]=sc.nextInt();
			while(marks[i]<0||marks[i]>100)
			{
				System.out.println("please enter correct marks");
				marks[i]=sc.nextInt();
			}
		}
		int finMark=0;
		double avg=0.0;
		String grade="";
		for(int i=0;i<marks.length;i++)
		{
			finMark+=marks[i];
		}
		avg=finMark/subject;
		if(avg>=90&&avg<=100)
		{
			grade="A+";
		}
		else if(avg>=80&&avg<90)
		{
			grade="A";
		}
		else if(avg>=70&&avg<80)
		{
			grade="B";
		}
		else if(avg>=60&&avg<70)
		{
			grade="C";
		}
		else if(avg>=50&&avg<60)
		{
			grade="D";
		}
		else if(avg>=40&&avg<50)
		{
			grade="E";
		}
		else if(avg>=30&&avg<40)
		{
			grade="F";
		}
		else 
		{
			grade="FF";
			
		}
		System.out.println("\nCandidate Name="+name+"\nNo of Subjects="+subject+"\nTotal Marks="
				+finMark+"\nAverage Marks="+avg+"\nGrade="+grade);
	}

}
