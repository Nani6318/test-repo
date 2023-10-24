import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		str=str+" ";
		int res=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			char nextchar=str.charAt(i+1);
			if(ch=='M') {
				res+=1000;
			}
			else if(ch=='C') {
				if(nextchar=='M') {
					res+=900;
					i++;
				}
				else if(nextchar=='D') {
					res+=400;
					i++;
				}
				else {
					res+=100;
				}
			}
			else if(ch=='D') {
				res+=500;
			}
			else if(ch=='X') {
				if(nextchar=='C') {
					res+=90;
					i++;
				}
				else if(nextchar=='L') {
					res+=40;
					i++;
				}
				else {
					res+=10;
				}
			}
			else if(ch=='L') {
				res+=50;
			}
			else if(ch=='I') {
				if(nextchar=='X') {
					res+=9;
					i++;
				}
				else if(nextchar=='V') {
					res+=4;
				}
				else {
					res++;
				}
			}
			else {
				res+=5;
			}
			
		}
		System.out.println("\nRoman Number: "+str);
		System.out.println("Equivalent Integer: "+res+"\n");	
	}

}
