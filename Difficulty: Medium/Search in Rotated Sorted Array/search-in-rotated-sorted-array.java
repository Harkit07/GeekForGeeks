class Solution {
    int srch(int arr[], int key, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        
        if(arr[mid]==key){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=key && key <=arr[mid]){
                return srch(arr, key, si, mid-1);
            }else{
                return srch(arr, key, mid+1, ei);
            }
        }else{
            if(arr[mid]<=key && key<=arr[ei]){
                return srch(arr, key, mid+1, ei);
            }else{
                return srch(arr, key, si, mid-1);
            }
        }
    }
    
    int search(int[] arr, int key) {
        // code here
        return srch(arr, key, 0, arr.length-1);
    }
}