package koreait04;

public class C19_MethodTest {

    // main �޼ҵ� : ������ ������. ���α׷� ������ ���ؼ��� �� �־�� �� �޼ҵ�. static	
	public static void main(String[] args) {
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ϴ�.");
		System.out.println("���α׷��� main �޼ҵ��� ���ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
		methodA();  // �޼ҵ� ȣ��(����). �ʿ��� �� ȣ���մϴ�.
		System.out.println("2.");
		methodB(11, 33); // 11,33�� �޼ҵ� ���࿡ �ʿ��� ����
		methodB(929,111);
//      methodB(929,12.1); // ����: �Ű����� ���� ����
		System.out.println("3.");
		methodC(929, 12.1);
		methodC(929, 121); // ���� �ƴ� : �ڵ�ĳ����(����ȯ)
		System.out.println("4.");
		System.out.println("return = " + methodD()); // ��ȯ���� �޾Ƽ� ����ϴ� ����.
		int temp = methodD();  // ��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println("return = " + temp);
		System.out.println("5.");
		System.out.println("return = " + methodE(12, 13.8));
		System.out.println("6.");
		System.out.println(methodf('i', 4));
		
		char ch = 'a';
		int val = 3;
		ch = methodf(ch, val);
		System.out.println("return = " + ch);
		
		
	}
	// static �� main���� ������ �޼ҵ�� �����ϰ� static�̾�� �մϴ�.
	// �޼ҵ� ����(����)
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		
	 }
	public static void methodB(int a, int b) { // int a, int b�� ���ڰ��� ���޹޴� �Ű�����
		System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.");
		System.out.println("���޹��� �� a = " + a + " b = "+ b);
	}
	public static void methodC(int a, double b) { 
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.");
		System.out.println("���޹��� �� a = " + a + " b = "+ b);
	}
	public static int methodD() {   // ��ȯ���� �ִ� ���� : ��ȯ���� int ������, �ݵ�� return�� �ʿ��մϴ�.
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		return 999;
	}
		public static double methodE(int a, double b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a+b;   // ���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}
		public static char methodf(char a, int b) {
		System.out.println("##������° �޼ҵ� ���ǿ����Դϴ�.");
		return (char)(a+b);
		}

		
	}

/*
 * String Ŭ������ �޼ҵ带 �����ϱ� ���ؼ�, ����
 * �� �޼ҵ��� ��������
 * 
 * �޼ҵ��� �ֿ� ��� : ��ȯ��(����), ����(argument) �Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public �Ǵ� static ���� ����
 *    �� ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� ��� ��
 *    �� ���� : �޼ҵ� ������ ���ؼ� �ʿ��� ������ (���İ� ������ ���� �ʿ�) - ������ ������ ������ �پ��մϴ�.
 *    �� �޼ҵ� �̸� : �ĺ��� 
 *    �� public : ����������, static : ���� ���
 * 
 * 
 */
