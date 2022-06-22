//(2/3/4)-D Sqr/Rects/Cubes/Boxes?
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		 long n;
		while(true){
		    n=sc.nextInt();
		    long a,b,c,d,e=0,f,i;
		a = n*(n+1)*(2*n+1)/6;
		b = (n+1)*n/2*(n+1)*n/2 - a;
		c = n*(n+1)/2*n*(n+1)/2;
		d = (n+1)*n/2*(n+1)*n/2*(n+1)*n/2 - c;
		
		for(i=1; i<n; i++){
		    e+=i*i*i*i;
		}
		f=(n+1)*n/2*(n+1)*n/2*(n+1)*n/2-e;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		} 
		
		
		    
		
		
	}
}
