public class Tester{
  public static void main(String[] args)
    {
      ArrayOps.sum(new int[] {2,3,4});
      ArrayOps.largest(new int[] {3, 4, 10});
      ArrayOps.sumRows(new int[][] {{  1,  0, 12, -1 },
                                    {  7, -2,  2,  1 },
                                    { -5, -2,  2, -9 }});
      ArrayOps.largestInRows(new int[][] {{  1,  0, 12, -1 },
                                          {  7, -2,  2,  1 },
                                          { -5, -2,  2, -9 }});
      ArrayOps.sum(new int[][] {{  1,  0, 12, -1 },
                                {  7, -2,  2,  1 },
                                { -5, -2,  2, -9 }});
      ArrayOps.sumCols(new int[][] {{  1,  0, 12, -1 },
                                    {  7, -2,  2,  1 },
                                    { -5, -2,  2, -9 }});
      ArrayOps.isRowMagic(new int[][] {{  1,  0, 12, -1 },
                                        {  7, -2,  2,  1 },
                                        { -5, -2,  2, -9 }});
      ArrayOps.isRowMagic(new int[][] {{  1,  0, 12, -1 },
                                        {  -3, 3,  4,  8 },
                                        { -24, -50,  -14, 100 }});

    }



}
