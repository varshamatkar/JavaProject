package practice;

public class CGPAOfThreeNumbers {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
double subject1=70.50;
double subject2=80.80;
double subject3=75.75;

double totalMarks = subject1 + subject2 + subject3;

double cgpa = totalMarks / 300 * 10;//maximum marks for 3 subjects = 300

System.out.println("CGPA of three subjects : "+cgpa);
	
	}

}
