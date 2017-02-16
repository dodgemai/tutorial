
public class Complexity {

	/*Problem 1*/
	/**
	 * @param dubb, an array of doubles
	 * @param eps, a double
	 * @param d1, a double
	 * @return true if there is an element d2 in the array such that |d1-d2|<eps
	 */
	public static boolean contains(double[] dubb, double eps, double d1) {
		for(int i = 0; i < dubb.length; i++){
			if(Math.abs(d1 - dubb[i]) < eps){
				return true;}}
		return false;
	}

	/*Problem 2*/
	/**
	 * @param x, an int
	 * @param y, an int
	 * @return x^y, x raised to the yth power, a double
	 */
	public static double fastExp(int x, int y){
		int x_pow = 1;

		if (y == 0){
			return x_pow;
		}
		if (y == 1){
			return x;
		}
		if (y < 0){
			x_pow = (x_pow * x);
			return 1 / (x * fastExp(x, -(y + 1)));
		}
		else {
			x_pow = (x_pow * x);
			return x_pow * fastExp(x, (y - 1));
		}
	}

	/*Problem 3*/
	/**
	 * @param inputArray, an array of integers
	 * @return pairArray, an array of all possible pairs of elements from the input array
	 */
	public static Pair[] allPairs(int[] inputArray){
		Pair[] pairArray = new Pair[(inputArray.length*inputArray.length)];

		if(inputArray == null){throw new IllegalArgumentException("the integer array is empty");}

		for(int i = 0; i < inputArray.length; i++){
			for(int j = 0; j < inputArray.length; j++){ 
				while(i == 0){pairArray[j] = new Pair(inputArray[i], inputArray[j]);}
				pairArray[(i*inputArray.length) + j] = new Pair(inputArray[i], inputArray[j]);
			}		
		}
		return pairArray;
	}

	/*Problem 4*/
	/**
	 * @param arr, an array of strings
	 * @param n, an int
	 * @return newstr, a string of the original string repeated n times
	 */
	public static String concatAndReplicateAll(String arr[], int n){
		String newstr = new String("");

		if(arr == null){throw new IllegalArgumentException("the integer array is empty");}

		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < n; j++){
				newstr = newstr + arr[i];
			}
		}
		return newstr;
	}

	/*Problem 5*/
	/**
	 * @param arr1, array of integers
	 * @param arr2, array of integers
	 * @return interleaveArray, an array of ints from arr1 and arr2
	 */
	public static int[] interleave (int[] arr1, int[] arr2){
		int j = 0;
		int[] interleaveArray = new int[(arr1.length + arr2.length)];
		if(arr1.length == arr2.length){
			for(int i = 0; i < (arr1.length); i++){
				interleaveArray[2*i] = arr1[i];
				interleaveArray[2*i+1] = arr2[i];}
		}
		if(arr1.length < arr2.length){
			for(j = 0; j < arr1.length; j++){
				interleaveArray[2*j] = arr1[j];
				interleaveArray[2*j+1] = arr2[j];}
			for(int k = j; k < arr2.length; k++){
				interleaveArray[k + j] = arr2[k];}
		}
		if(arr2.length < arr1.length){
			for(j = 0; j < arr2.length; j++){
				interleaveArray[2*j] = arr1[j];
				interleaveArray[2*j+1] = arr2[j];}
			for(int k = j; k < arr1.length; k++){
				interleaveArray[k+j] = arr1[k];}
		}
		return interleaveArray;
	}
	
}

