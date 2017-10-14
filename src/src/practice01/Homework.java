package practice01;

import java.util.Scanner;


/*一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，当值大于5000
 * 时，把值按照指定顺序输出来。
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
	System.out.println("请输入一个整数");
	int n=scanner.nextInt();
	function(n);
	}
}
