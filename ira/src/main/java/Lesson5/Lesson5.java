package Lesson5;

public class Lesson5 {
	public static void main(String[] args) {
		byte b = 127;
		b+=1;
		b-=5;
		System.out.println(b);
		
		int i=5;
		if (i%2 == 0) {
		System.out.println("i dividable by 2");
		} else if (i%3 == 0){
			System.out.println("i dividable by 3");
		}else if (i<15){
			System.out.println("i less than 15");
		}else {
			System.out.println("i is other..");
		}
		System.out.println("End");
		
		for(int f=0;f<10;f+=2){
			System.out.println(f);
		}
		int k=231;
		for(int n=0;n<6;n++){
			k/=2;
			if (n%2==0){System.out.print("Step ");
			System.out.println(n);
			System.out.println(k);	
			}
			
		}
int m=231;
for (int t=0;t<6;t++){
	m/=2;
	if (m%2 !=0){
		continue;
	}
	System.out.print("Step ");
	System.out.println(t);
	System.out.println(m);	
	}
		//if (k%2!=0) {
			//	break;
			//			}
			
			
			}
			
		
		
		}
		
	
