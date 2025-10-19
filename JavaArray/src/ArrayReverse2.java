public class ArrayReverse2 {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int left=0;
        int right=length-1;
        int temp;
        //int i=0;
        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
