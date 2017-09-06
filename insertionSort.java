public class insertionSort{
	public static void main(String[] args){
		int[] a = {5, 3, 2, 4, 1, 1, 2};

		insertionSort(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}	
	private static void insertionSort(int[] a){

		for(int j = 1; j < a.length; j++){
			int key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key){
				a[i+1] = a[i];
				i = i - 1;
			}
			a[i + 1] = key;
        }
	}


}