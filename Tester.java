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
      ArrayOps.isRowMagic(new int[][] {{  1,  2, 3, 4 },
                                        {  2, 3,  4,  1 },
                                        { 3, 4,  1, 2 }});
      ArrayOps.isRowMagic(new int[][] { {  1,  1, 1 },
                                        {  2, 2, 2 },
                                        { 3,  3, 3 }});
      ArrayOps.isRowMagic(new int[][] { { 2, 2, 2 },
                                        { 2, 2, 2 }});
      int[][]E = {{  2,  4, 2 }, {  2, 2, 2 }};
      ArrayOps.isLocationMagic(E, 0, 1); //false
      ArrayOps.isLocationMagic(E, 1, 1); //true

    }



}
