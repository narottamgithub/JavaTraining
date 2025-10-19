public class SmallestElementArray {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int smallest=arr[0];
        for(int i=1;i<length;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
