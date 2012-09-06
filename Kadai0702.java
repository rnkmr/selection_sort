// 20120906
// �ۑ�Q�F�o�u���\�[�g�A�N�C�b�N�\�[�g�ȊO�i�R���\�[�g�A�q�[�v�\�[�g�A
//		�I���\�[�g�A�}���\�[�g�j�����I�сA�v���O�����������B
// �I���\�[�g��I�ԁB

public class Kadai0702 {
    static void selection_sort(int[] array) {
    	int min = 0;
    	int numOfMin = 0;
    	for(int j=0;j<array.length-1;j++){

    		// �z��̂����A�ł��������l��min�ɑ������
    		for(int i=j;i<array.length;i++){
    			if(i==j || min>array[i]){
    				min = array[i];
    				numOfMin = i;
    			}
    		}
    		// min�̒l���A�z��̍��[�ɑ������
    		// �z��̍��[�ɓ����Ă����l�́Amin�Ɠ������l�̓����Ă����ϐ��ɑ������
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
