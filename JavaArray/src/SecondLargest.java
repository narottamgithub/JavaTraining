public class SecondLargest {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int largest=-1;
        int secondlargest=-1;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else {
                    if(arr[i]>secondlargest)
                    {
                        secondlargest=arr[i];
                    }
            }

        }
        System.out.println(secondlargest);

    }
}
