class Solution {
    ArrayList<Integer> findTwoElement(int arr[])
    {
        Arrays.sort(arr);
        int Sum=arr[0];
        int maxElement=arr.length;
        int first=-1;;
        for(int i=1;i<arr.length;i++)
        {
            Sum+=arr[i];
            if(arr[i]==arr[i-1])
            {
                first=arr[i];
            }
        }  
        long  totalSum=((long)maxElement*(maxElement+1))/2;
        ArrayList<Integer>aList=new ArrayList<Integer>();
        aList.add(first);
        aList.add((int )(totalSum-Sum+first));
        return aList;
    }
}
