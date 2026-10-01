class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                if(res.size()==0||res.get(res.size()-1)!=arr1[i])
                res.add(arr1[i]);
                i++;
            j++;
            }
             else if(arr1[i] < arr2[j]){
                i++;  
            }
            else{
                j++;
            }

        }
        return res;
    }
} 