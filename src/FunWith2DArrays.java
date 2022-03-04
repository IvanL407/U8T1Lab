public class FunWith2DArrays {

    public static int totalElements(int[][] temp)
    {
        int numRows = 0;
        int count = 0;
        for (int i = 0; i < temp.length; i++)
        {
            numRows = temp[i].length;
            count++;
        }
        return (numRows * count);
    }

    public static void fourCorners(String[][] temp)
    {
        int numRows = temp.length;
        int numColumns = temp[0].length;


        System.out.println(temp[0][0]);
        System.out.println(temp[0][numColumns - 1]);
        System.out.println(temp[numRows - 1][0]);
        System.out.println(temp[numRows - 1][numColumns - 1]);

    }

    public static double average(int[][] temp)
    {
        double total = 0;
        for (int x = 0; x < temp.length; x++)
        {
            for (int i = 0; i < temp[0].length; i++)
            {
                total += temp[x][i];
            }
        }
        return (total / (temp.length * temp[0].length));
    }

    public static int[] indexFound(String[][] temp, String target)
    {
        int[] index = new int[2];
        for (int x = 0; x < temp.length; x++)
        {
            for (int i = 0; i < temp[0].length; i++)
            {
                if (temp[x][i].equals(target))
                {
                    index[0] = x;
                    index[1] = i;
                    return index;
                }
            }
        }
        index[0] = -1;
        index[1] = -1;
        return index;
    }
}
