public class SumElementArray {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int sum=0;
        for(int i=0;i<length;i++)
        {
            sum=sum+arr[i];
            //System.out.println("array index: "+ i + ": "+arr[i]);
        }
        System.out.println(sum);
    }
}
