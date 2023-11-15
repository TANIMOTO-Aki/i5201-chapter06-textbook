public class Sample6_6_1 {
    public static void main(String[] args) {
        int[] arrayScore = { 80, 70, 90 };

        int total = 0;                                          //①
        for (int idx = 0; idx < arrayScore.length; idx++) {     //②
            total += arrayScore[idx];                           //③
        }
        System.out.println(total);
    }
}
/* プログラムの説明
 * ①合計計算の定石。０から始める
 * ②添字idxの値を０→１→２と変化させる
 * ③配列の要素の内容を順番に加える
 *  idxが０の状態でtotal += arrayScore[idx]の計算を行う
 *  idxが１の状態でtotal += arrayScore[idx]の計算を行う
 *  idxが２の状態でtotal += arrayScore[idx]の計算を行う
 */