public class ArrayOps{}

  public static int sum(int[] arr)
    {
      int sum = 0;
      for (int i = 0; i < arr.length; i++)
        sum += Integer.parseInt(arr[i]);
      return sum;
    }

}
