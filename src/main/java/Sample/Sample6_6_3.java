public class Sample6_6_3 {
    public static void main(String[] args) {
        int[] arrayScore = { 80, 70, 90 };          //配列の初期値設定

        for ( int score : arrayScore) {             //①
            System.out.println(score);              //②
        }
    }
}
/* プログラムの説明
 * ①配列arrayScoreの先頭から順に、要素の値をint型変数scoreへ設定し、②のコードブロックへ進む
 *  配列から参照できる要素がなくなった時点でループから抜ける
 * ②scoreの内容を表示して①へ戻る
 */