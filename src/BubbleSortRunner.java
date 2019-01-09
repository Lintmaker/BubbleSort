public class BubbleSortRunner
{
    public static void main (String [] args)
    {
        int [] testArr = SortingUtil.randIntArr(5);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));

        long time= System.nanoTime();
        SortingUtil.bubbleSort(testArr);
        time=System.nanoTime()-time;

        System.out.println("After: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("Time taken: "+ time);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));

        long time1= System.nanoTime();
        SortingUtil.selectionSort(testArr);
        time1=System.nanoTime()-time1;

        System.out.println("After: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("Time taken: "+ time1);
    }
}
