package 정리함;



public class 연습장 {
	
	public static void main(String[] args) {
		int[] array= {10,3,5,6,1};
		int change;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j< array.length-1; j++ ) {
				if(array[j] > array[j+1]) {
					change = array[j];
					array[j] = array[j+1];
					array[j+1] = change;
					array[i]= array[j+1];
				}System.out.println(array[i]);
			}
		}
	}

} 

