public class Sample6_4_1 {
    public static void main(String[] args) {
        int[] arrayScore = {80,70,90};                  //①

        for (int i = 0; i < arrayScore.length; i++) {   //②
            System.out.println(arrayScore[i]);          //③
        }
    }
}

/*
 * プログラムの説明
 * ①int型の配列arrayScoreを宣言し、初期値を設定する
 *          arrayScore.length: 3
 * ②配列サイズを超えない限りforループを実行する
 *  i=0のとき 0<3を評価→true ③ 配列の要素の内容を表示して繰り返す
 *  i=1のとき 1<3を評価→true ③ 配列の要素の内容を表示して繰り返す
 *  i=2のとき 2<3を評価→true ③ 配列の要素の内容を表示して繰り返す
 *  i=3のとき 3<3を評価→false ループから抜ける
 */