public class Practice6_2 {
    public static void main(String[] args) {
        int[][] arrayScore  = {{95,70,85,85},
                               {90,70,80,90},
                               {90,65,80,80}};
        double[] subjectAverage = new double[arrayScore[0].length];
        int     subjectTotal;

        /* 科目平均の計算 */
        for (int i = 0; i < arrayScore[0].length; i++) {
            subjectTotal = 0;
            for (int j = 0; j < arrayScore.length; j++) {
                subjectTotal += arrayScore[j][i];
            }
            subjectAverage[i] = (double) subjectTotal / arrayScore.length ;
        }

        /* 科目平均の表示 */
        for (int i = 0; i < subjectAverage.length; i++) {
            System.out.println(subjectAverage[i]);
        }
    }
}
