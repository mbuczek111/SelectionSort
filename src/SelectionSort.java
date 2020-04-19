import java.util.Arrays;

public class SelectionSort {
    static void sort(int array[])
    {

        for (int i = 0; i < array.length-1; i++)
        {

            int minIndex = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{55, 66, 3, 44, 1, 0, -100, 53};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}

