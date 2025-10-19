public class ArrayReverse {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int[] rev=new int[length];
        int j=0;
        for(int i=length-1;i>=0;i--)
        {
            rev[j]=arr[i];
            j++;
        }
        for(int i=0;i<length;i++)
        {
            System.out.println(rev[i]);
        }
    }
}
