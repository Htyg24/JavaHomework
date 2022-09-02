/*
1. Задан массив, например, nums = [1,7,3,6,5,6].
Написать программу, которая найдет индекс i для этого массива такой,
что сумма элементов с индексами < i равна сумме элементов с индексами > i.
 */

final class HomeworkPart1{

    public static void main(String[] args) {

        int[] nums = new int[] {1,7,3,6,5,6};
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int leftSum = 0;
        int rightSum = 0;
        while (leftIndex != rightIndex)
            if (leftSum > rightSum){
                rightSum += nums[rightIndex--];
            }
            else
                leftSum += nums[leftIndex++];
        if (rightSum == leftSum)
            System.out.println(leftIndex);
        else
            System.out.println("No appropriate index");
    }
}