package koreait06;

import java.util.Random;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		Random r = new Random();
		// 배열요소의 삽입/삭제
		int[] test = {11,22,33,44,55,66,77};
		// 인덱스 k에 삽일할때 - 오른쪽 인덱스 증가 방향으로 이동
		int k = 2;
		for (int i=test.length-2;i>=k;i--) {
//		for (int i=2;i<test.length-1;i++) { // 오작동
			test[i+1] = test[i];
		}
		test[k]=23;
		for(int i=0;i<test.length;i++)
			System.out.print(test[i]+"\t");
		int[] test2 = {11,22,33,44,55,66,77};
		// 인덱스 2를 삭제할때 - 왼쪽 인덱스 감소방향으로 이동
		System.out.println("\n----------------------------------------------");
		for (int i=k+1;i<test2.length;i++)
			test2[i-1] = test2[i];
		for (int i=0;i<test2.length;i++)
		System.out.print(test2[i]+"\t");
		
		
	}

}
