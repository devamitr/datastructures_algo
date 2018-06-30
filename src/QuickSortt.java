public class QuickSortt {
    public static int[] sort(int[] arr, int low, int high){
        if(high>low) {
            int pi = partition(arr, low, high);
            arr = sort(arr, low, pi - 1);
            arr = sort(arr, pi + 1, high);
        }
        return arr;
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp1 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp1;
        return  i;
    }
}
