public class BubbleSortRunner
{
    public static void main (String [] args)
    {
        int [] testArr = SortingUtil.randIntArr(4);

        System.out.println("Before: ");
        System.out.println(SortingUtil.print(testArr));
        System.out.println("After: ");
        SortingUtil.bubbleSort(testArr);
        System.out.println(SortingUtil.print(testArr));
        System.out.println();
    }
}
