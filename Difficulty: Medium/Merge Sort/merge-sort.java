class Solution {
    public void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //Copy to Original arr
        for(i=si,k=0; i<=ei; i++, k++){
            arr[i]= temp[k];
        }
    }
    
    public void mergeSort(int arr[], int l, int r) {
        if(l>=r){
            return;
        }
        // code here
        int mid = l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
}