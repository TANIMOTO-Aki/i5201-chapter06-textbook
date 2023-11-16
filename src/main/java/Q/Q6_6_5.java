public class Q6_6_5 {
    public static void main(String[] args) {
        /* 変数と配列の宣言 */
        String[] arrayEvalu = {"優","良","可","不可"};
        int[] arrayCount = {23,10,5,2};
        double[] arrayRatio = {0,0,0,0};        //割合（配列）
        int total = 0;

        for (int idx = 0; idx < arrayEvalu.length; idx++) {
                                                //人数累計
            total += arrayCount[idx];
        }
        for (int idx = 0; idx < arrayEvalu.length; idx++) {
                                                //割合算出
            arrayRatio[idx] = (double)arrayCount[idx] / total * 100;
        }
        for (int idx = 0; idx < arrayEvalu.length; idx++) {
                                                //表示
            System.out.print(arrayEvalu[idx] + "\t");
            System.out.println(arrayRatio[idx] + "%");
        }
    }
}
