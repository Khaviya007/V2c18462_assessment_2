package primeno;

public class PrimeClass {

	
 public static int primfunc(int n) {
	int i;
	int j=0;
	//temp=n;
      for(i=1;i<=n;i++)
    {
	  for(j=2;j<=i;j++)
	  {
		if((i%j)==0)
			break;
	}

    
	
      if(i==j)
    		System.out.println(" "+i);
    }
   
      return j;
   
     
}
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
int limit=50;
int k;
System.out.println("Enter the limit: "+limit);
k=primfunc(limit);
//System.out.println("K is: "+k);
	}
 
}

