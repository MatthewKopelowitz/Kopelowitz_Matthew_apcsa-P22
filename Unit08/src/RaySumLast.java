//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int sum;
	private int[] mainRay;
	
	
	public RaySumLast() {
		
		setRay(null);
		
	}
	
	public RaySumLast(int[] ray) {
		
		setRay(ray);
		
	}
	
	
	public void setRay(int[] ray) {
		
		mainRay = ray;
		
	}
	
	
	
	
	public static int go(int[] ray)
	{
		int sum = 0;
		
		for (int i = 0; i < ray.length; i++) {
			
			if (ray[i] > ray[ray.length - 1]) {
				
				sum = sum + ray[i];
				
			}
			
		}
		
		if (sum == 0) {
			
			return -1;
		}
		
		return sum;
	}

	
	public String toString() {
		
		String output = "" + go(mainRay);
		
		return output;
	}








}