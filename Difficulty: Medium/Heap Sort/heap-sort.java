class Solution {
    // Function to sort an array using Heap Sort.
    private void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        
        if(left<size && arr[minIdx]<arr[left]){
            minIdx = left;
        }
        if(right<size && arr[minIdx]<arr[right]){
            minIdx = right;
        }
        
        if(minIdx!=i){
            int temp = arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
            heapify(arr, minIdx, size);
        }
    }
    
    public void heapSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, 0, i);
        }
    }
}