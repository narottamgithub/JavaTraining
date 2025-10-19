public class ThirdLargest {
    public static void main(String[] arg)
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int largest=-1;
        int secondlargest=-1;
        int thirdlargest=-1;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>largest)
            {
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=arr[i];
            }
            else if (arr[i] > secondlargest) {
                    thirdlargest = secondlargest;
                    secondlargest = arr[i];
                }

                else if(arr[i]>thirdlargest)
                    {
                        thirdlargest=arr[i];
                    }

            }
        System.out.println(thirdlargest*secondlargest*largest);

        }

}
