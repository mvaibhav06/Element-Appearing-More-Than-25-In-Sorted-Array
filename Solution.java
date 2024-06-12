class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int a = (len/4)+1;
        int count = 1;
        int i = 0;
        for(i=0; i<len-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(count >= a){
                    return arr[i];
                }
                count = 1;
            }
        }
        if(count >= a){
            return arr[i];
        }
        return -1;
    }
}
