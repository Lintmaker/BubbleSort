public class SortingUtil
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted= SortingUtil.isSorted(arr);
        int lastSwap = arr.length;
        int Temp=0;
        while(!sorted)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i+1!=arr.length)
                {
                    if (arr[i] > arr[i + 1])
                    {
                        SortingUtil.swap(arr, i, i + 1);
                    }
                }
                Temp=i;
            }
            lastSwap=Temp;
            sorted=SortingUtil.isSorted(arr);

        }
        return arr;
    }

    public static boolean isSorted(int[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                result=false;
            }
        }
        return result;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]= (int)(Math.random()*10001);
        }
        return arr;
    }

    public static String print(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result += " " + num;
        }
        return result;
    }
}
