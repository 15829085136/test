package practice01;

import java.util.Scanner;


/*һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳���������ֵ����5000
 * ʱ����ֵ����ָ��˳���������
 */

public class Homework {
public static void function(int n){
	if(n<5000){
		int m=2*n;
		System.out.println(m);
		function(m);
	}else{
		int t=n/2;
		System.out.println(t);
		function(t);
	}
}
	
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������һ������");
	int n=scanner.nextInt();
	function(n);
	}
}
