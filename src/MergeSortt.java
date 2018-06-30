public class MergeSortt {

    public static void sort(int[] arr, int low, int high){
        if(high>low) {
            int m = (low + high) / 2;
            sort(arr, low, m);
            sort(arr, m + 1, high);
            merge(arr, low, m, high);
        }
    }

    private static void merge(int[] arr, int low, int m, int high){
        int[] L = new int[m-low+1];
        int[] H = new int[high-m];
        for(int i=low, j=0;i<=m; i++, j++)
        {
            L[j] = arr[i];
        }
        for(int i=m+1, j=0; i<=high;i++, j++)
        {
            H[j] = arr[i];
        }
        int i=0,j=0,k=low;
        while (i<L.length&& j<H.length)
        {
            if(L[i]<H[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = H[j];
                j++;
            }
            k++;
        }
        while(i<L.length)
        {
            arr[k] = L[i];
            i++;k++;
        }
        while(j<H.length)
        {
            arr[k] = H[j];
            k++;j++;
        }
    }
}
