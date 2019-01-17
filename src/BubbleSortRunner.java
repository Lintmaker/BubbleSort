public class BubbleSortRunner
{
    public static void main (String [] args)
    {
        int [] testArr = SortingUtil.randIntArr(10);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));

        long time= System.nanoTime();
        SortingUtil.bubbleSort(testArr);
        time=System.nanoTime()-time;

        System.out.println("After: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("Time taken: "+ time);

        testArr = SortingUtil.randIntArr(5);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));

        long time1= System.nanoTime();
        SortingUtil.selectionSort(testArr);
        time1=System.nanoTime()-time1;

        System.out.println("After: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("Time taken: "+ time1);

        String[] testArrString = SortingUtil.randomStringArr(10, 7);

        System.out.println("Before: ");
        System.out.println(SortingUtil.printString(testArrString));

        long time2= System.nanoTime();
        SortingUtil.bubbleSortString(testArrString);
        time2 = System.nanoTime() - time2;

        System.out.println("After: ");
        System.out.println(SortingUtil.printString(testArrString));
        System.out.println("Time taken: "+ time2);

        testArr = SortingUtil.randIntArr(10);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));

        long time3 = System.nanoTime();
        SortingUtil.insertionSort(testArr);
        time3 = System.nanoTime() - time3;

        System.out.println("After: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("Time taken: "+ time3);
    }
}
