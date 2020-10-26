public class ArrayOps{

  public static int sum(int[] arr)
    {
      int sum = 0;
      for (int i = 0; i < arr.length; i++)
        sum += arr[i];
      return sum;
    }

  public static int largest(int[] arr)
    {
      int max = 0;
      for (int i = 0; i < arr.length; i++)
        {
          max = Math.max(arr[i], max);
        }
      return max;
    }

  public static int[] sumRows(int[][] matrix)
    {
      int[] arraysum = new int[matrix[0].length];
      for (int i = 0; i < matrix.length; i++)
        {
          int indivsum = 0;
          for (int j = 0; j < matrix.length; j++)
            {
              indivsum += matrix[i][j];
            }
          arraysum[i] = indivsum;
        }
      return arraysum;
    }
/*
  public static int[]largestInRows(int[][] matrix)
    {

    }

  public static sum(int[][] arr)
    {

    }
*/
}
