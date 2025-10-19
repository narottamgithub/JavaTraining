public class ReverseArray {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        for(int i=length-1;i>=0;i--)
        {
            System.out.println("array index: "+ i + ": "+arr[i]);
        }
    }
}
