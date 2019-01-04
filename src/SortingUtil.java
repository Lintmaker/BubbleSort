public class SortingUtil
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static int [] bubbleSort(int[] arr)
    {
        int lastSwap = arr.length-1;
        while(SortingUtil.sorted(arr)==false)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i!=arr.length)
                {
                    if(arr[i]>arr[i+1]) {
                        SortingUtil.swap(arr, i, i + 1);
                        lastSwap = i;
                    }
                }
            }
        }
        return arr;
    }

    public static boolean sorted(int[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                result=false;
                break;
            }
        }
        return result;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]= (int)(Math.random()*10000);
        }
        return arr;
    }

    public static String print(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }
}
