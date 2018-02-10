public class quickSort{
	public static void main(String[] args){
		int[] array= {7,9,5,6,4,1,3,2};

		quickSort(array, 0, array.length -1);
		for(int num: array){
			System.out.println(num);
		}
	}

	private static void quickSort(int[] array, int p, int r){
		if(p < r){
			int q = partition(array, p, r);

			quickSort(array, 0, q-1);
			quickSort(array, q+1, r);

		}
	}


	private static int partition(int[] array, int p, int r){
		int x = array[r];

		int i = p-1;

		for(int j = p ; j <= r - 1; j++){
			if(array[j] <= x){
				i = i + 1;

				swap(array, i, j);
			}
		}

		swap(array, i+1, r);

		return i+1;

	}


	private static void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}