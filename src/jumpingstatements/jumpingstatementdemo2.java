package jumpingstatements;

public class jumpingstatementdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int a=1; a<=10; a++)
		{
			
			if(a==3 || a==5 || a==7)
			{	
				continue;
			}
			
			System.out.println(a);
		}
		// demo for continue == skipping 
	}

}
