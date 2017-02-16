
public class Pair {
    private int fst;
    private int snd;
    
    public Pair(int fst, int snd) {
        this.fst = fst;
        this.snd = snd;
    }
    public int getFst() { return fst; }
    public int getSnd() { return snd; }

    public static Pair[] allPairs(int[] inputArray){
		Pair[] pairArray = new Pair[(inputArray.length*inputArray.length)];
		
		if(inputArray == null){throw new IllegalArgumentException("the integer array is empty");}
		
		for(int i = 0; i < inputArray.length; i++){
			for(int j = 0; j < inputArray.length; j++){ 
				pairArray[(i*inputArray.length) + j] = new Pair(inputArray[i], inputArray[j]);
			}		
		}
		return pairArray;
	}
    
    public String toString(){
		return "(" + Integer.toString(this.fst) + ", " + Integer.toString(this.snd) + ")";
    }
    
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3};
    	Pair[] arr2 = allPairs(arr);
    	for (int i = 0; i < 9; i++) {
    	System.out.println(arr2[i].toString());
    	}
    }
}

