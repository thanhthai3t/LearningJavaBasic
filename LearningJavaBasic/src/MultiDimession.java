
public class MultiDimession {

	public static void main(StringTest[] args) {
		
		//single dimessional array
		int[] oneDimesionalArray = {100,200,300};
		System.out.println(oneDimesionalArray[2]);
		
		//multi dimension array
		
		int[][] multiDimesionalArray = {{10,20,30}, {100,200,300,400}, {23,43,64}};
		System.out.println(multiDimesionalArray[2][1]);
		
		double[][] doubleArray = new double[4][2];
		
		doubleArray[3][1] = 3.2511;
		
		System.out.println(doubleArray[3][1]);
		
		for(int array = 0; array < multiDimesionalArray.length; array++) {
			System.out.println("variable array = " +array);
			for(int item = 0; item <multiDimesionalArray[array].length; item++) {
				//System.out.println("variable item = " +item);
				System.out.print("item = " +item + "=" +multiDimesionalArray[array][item] +"\t");
			}
			System.out.println();
		}
		
	}
 
}
