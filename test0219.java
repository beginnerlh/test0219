package lianxi0219;

public class test0219 {

	public static void main(String[] args) {
		Solution S = new Solution();
		int[] digits = new int[] { 9, 9, 9, 9, 9};
		int[] a = S.plusOne(digits);
		System.out.print("��һ������飺");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
	}
}

class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int i = len-1;
        int th = 9;
        digits[i] += 1;
        if (digits[i] > th){   //����9  ������λ
            while(i > 0 && digits[i] > th){
                digits[i] = 0;
                digits[--i] += 1;
            }
            if (i == 0 && digits[i] > th){   //�����λ����9�� ����������һλ����λ��Ϊ1
                digits = new int[len+1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}
