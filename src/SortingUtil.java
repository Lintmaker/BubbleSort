public class SortingUtil
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void swapString(String[] arr, int  i, int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static boolean checkSum(int [] arr)
    {
        int sum = 0;
        int sortedSum = 0;
        for(int x = 0; x<arr.length; x++)
        {
            sum += arr[x];
        }
        SortingUtil.bubbleSort(arr);
        for (int y = 0; y< arr.length;y++ )
        {
            sortedSum += arr[y];
        }
        if (sum == sortedSum)
        {
            return true;
        }
        return false;
    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted= SortingUtil.isSorted(arr);
        int lastSwap = arr.length;
        int temp=0;
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
                temp=i;
            }
            lastSwap=temp;
            sorted=SortingUtil.isSorted(arr);

        }
        return arr;
    }
    public static String[] bubbleSortString(String[] arr)
    {
        boolean sorted= SortingUtil.isSortedString(arr);
        int lastSwap = arr.length;
        int temp=0;
        while(!sorted)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i+1!=arr.length)
                {
                    if (arr[i].compareTo(arr[i + 1]) == -1)
                    {
                        SortingUtil.swapString(arr, i, i + 1);
                    }
                }
                temp=i;
            }
            lastSwap=temp;
            sorted=SortingUtil.isSortedString(arr);

        }
        return arr;
    }
    public static int [] selectionSort (int [] arr)
    {
        int minValue;
        int minPos;
        for(int curPos = 0; curPos< arr.length-1; curPos++)
        {
            minValue = arr[curPos];
            minPos = curPos;

            for (int i = curPos + 1; i < arr.length; i++)
            {
             if (minValue > arr[i])
             {
                 minPos = i;
                 minValue = arr[i];
             }
             swap(arr,curPos, minPos);
            }
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
                break; //if there is an error, it breaks the loop and returns false for it to fix. Otherwise if the last value is an error it will be true instead of false.
            }
        }
        return result;
    }
    public static boolean isSortedString(String[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length-1; i++)
        {
            if(arr[i].compareTo(arr[i+1]) == -1);
            {
                result=false;
                break; //if there is an error, it breaks the loop and returns false for it to fix. Otherwise if the last value is an error it will be true instead of false.
            }
        }
        return result;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (int)(Math.random()*10001);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while(num > 0){
            int i = 0;
            String s = "";
            while(i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s += c;
                i++;
            }
            num--;
            arr[num] = s;
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
    public static String printString(String[] arr)
    {
        String result="";

        for(int num = 0; num < arr.length; num++)
        {
            result += arr[num] + " ";
        }
        return result;
    }
}
