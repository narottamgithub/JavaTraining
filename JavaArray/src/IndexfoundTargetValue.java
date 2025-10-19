public class IndexfoundTargetValue
{
    public static void main(String[] arg)
    {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        int target=5;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length-1;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i +"" +j);
                }
            }
        }
    }
}
