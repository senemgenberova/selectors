public class polindrom{
     public static void main(String []args){
        int n = Integer.parseInt(args[0]);
        int n1 = 0;
		int temp = n;
		int ters = 0;
		
		while(temp!=0){
			n1 = temp%10;
			ters = ters*10 + n1;
			temp = temp/10;
		}
		
		if(ters == n){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
       
        
     }
}
