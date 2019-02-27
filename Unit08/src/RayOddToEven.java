//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] stingRay;
	
	public RayOddToEven() {
		
		setArray(null);
		
	}
	
	public RayOddToEven(int[] ray) {
		
		setArray(ray);
	
	}
	
	public void setArray(int[] ray) {
	
		stingRay = ray;
	
	}
	
	public static int go(int[] ray)
	{
		int posOdd = 0;
		int posEven = 0;
		int distance = -1;
		
		for (int i = 0; i < ray.length; i++) {
			
			if (ray[i] % 2 != 0) {
				
				posOdd = i;
				
				for (int j = i; j < ray.length; j++ ) {
					
					if (ray[j] % 2 == 0) {
						
						posEven = j;
						break;
						
					}
					
					
				}
				
				break;
			}
			
			
			
		}
		
		distance = posEven - posOdd;
		
		if (distance == 0)
			distance = -1;
			
		
		
		return distance;
	}
}