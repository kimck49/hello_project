package helloworld_project;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scann = new Scanner(System.in);
        
        System.out.print("2자리의 정수 (10~99):");
        int number = scann.nextInt();
        
        if((number >=10) && (number <=99)) {
        	int a = number / 10;
        	int b = number % 10;
        	if(a == b) {
        		System.out.print("YES");
        	} else {
        		System.out.print("NO");
        	}
        }
		
		
	}

}
