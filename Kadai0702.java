// 20120906
// 課題２：バブルソート、クイックソート以外（コムソート、ヒープソート、
//		選択ソート、挿入ソート）から一つ選び、プログラムを書く。
// 選択ソートを選ぶ。

public class Kadai0702 {
    static void selection_sort(int[] array) {
    	int min = 0;
    	int numOfMin = 0;
    	for(int j=0;j<array.length-1;j++){

    		// 配列のうち、最も小さい値をminに代入する
    		for(int i=j;i<array.length;i++){
    			if(i==j || min>array[i]){
    				min = array[i];
    				numOfMin = i;
    			}
    		}
    		// minの値を、配列の左端に代入する
    		// 配列の左端に入っていた値は、minと等しい値の入っていた変数に代入する
    		int tmp = array[j];
    		array[j] = min;
    		array[numOfMin] = tmp;
    	}
    }

    static boolean check_sorted(int[] array) {
	boolean sorted = true;

	for (int i = 1; i < array.length; ++i) {
	    if(array[i-1] > array[i]) {
		sorted = false;
	    }
	}

	return sorted;
    }

    public static void main(String[] args) {
	//	int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] a = { 7, 9, 0, 3, 1, 8, 6, 2, 5, 4 };


	selection_sort(a);
	System.out.println(check_sorted(a));
    }
}
