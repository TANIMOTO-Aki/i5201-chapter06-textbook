public class Sample6_8_2 {
    public static void main(String[] args) {
        
        int [][] triMatrix  = new int[4][];                     //①
        triMatrix[0]        = new int[1];                       //②
        triMatrix[1]        = new int[2];                       //③
        triMatrix[2]        = new int[3];                       //④
        triMatrix[3]        = new int[4];                       //⑤

        /* 二次元配列triMatrixの表示 */
        for (int i = 0; i < triMatrix.length; i++) {            //⑥
            for (int j = 0; j < triMatrix[i].length; j++) {     //⑦
                triMatrix[i][j] = j + 1;
                System.out.print(triMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* プログラムの説明
 * ①４行の配列を宣言し、生成する。列数は未定のままの状態
 * ②０行目について、要素を１個生成する
 * ③１行目について、要素を２個生成する
 * ④２行目について、要素を３個生成する
 * ⑤３行目について、要素を４個生成する
 * ⑥triMatrix.lengthで行数を判定する
 * ⑦triMatrix[i].lengthで指定した行の列数を判定する
 */