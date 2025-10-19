public class LargestElementArray {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int largest=arr[0];
        for(int i=1;i<length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
