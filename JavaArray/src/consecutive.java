public class consecutive {
    public static void main(String[] arg)
    {
        int arr[]={0,1,1,1,0,0,0,0,1};
        int length=arr.length;
        int maxcount=0,count=1;
        for(int i=1;i<length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else {
                maxcount=Math.max(maxcount,count);
                count=1;
            }
        }
        System.out.println(maxcount);

    }
}
