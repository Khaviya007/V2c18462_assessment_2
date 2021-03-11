package maximummin;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[] {1,2,3,4,5};;
		int max=num[0],min=num[0];
		int i;
		
		for( i=1;i<num.length;i++)
		{
			if(num[i]>max) 
				max=num[i];
		}
				System.out.println("max no is: "+max);
			
			
			for( i=1;i<num.length;i++)
			{
				
			if(num[i]<min) 
			min=num[i];
			}
			System.out.println("min no is: "+min);
		
		
	
	}

}
