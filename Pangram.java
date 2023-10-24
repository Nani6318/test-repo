import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner is a class which read input from keyboard
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your String:");

		//to read string end of line
		String str=sc.nextLine();
		// replaceALL()-->replaces all spaces between strings
				//toLowerCase()->method which converts all characters to lower case		
		str=str.replaceAll("","").toLowerCase();
		String s="";
		for(char c='a';c<='z';c++) {
			//indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'c' in 'str'
			if(str.indexOf(c)!=-1) {
				s+=c;
			}
		}
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}

	}

}
