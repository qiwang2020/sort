public class mergeSort{
	public static void main(String[] args){
		int[] array= {6,7,8,9,2,1,3,4,5};

		int[] temp = new int[array.length];
		mergeSort(array, 0, array.length - 1, temp);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
	}
	private static void mergeSort(int[] array, int start, int end, int[] result){
		if(start >= end) return ;

		int mid = (start + end)/ 2;
		mergeSort(array, start, mid, result);
		mergeSort(array, mid + 1, end, result);

		merge(array, start, mid, end, result);

	}

	private static void merge(int[] array, int start, int mid, int end, int[] result){
		int left = start;
		int right = mid + 1;
		int index = start;

		while(left <= mid && right <= end){
			if(array[left] < array[right]){
				result[index++] = array[left++];
			}
			else{
				result[index++] = array[right++];
			}
		}
		while(left <= mid){
			result[index++] = array[left++];
		}
		while(right <= end){
			result[index++] = array[right++];
		}

		for(index = start; index <= end; index++){
			array[index] = result[index];
		}
	}
}