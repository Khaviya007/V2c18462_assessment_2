package evenodd;

public class Evodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[] {1,2,3,4,5};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
				System.out.println(num[i]+"is even no");
			else
				System.out.println(num[i]+"is odd no");
		}

	}

}
