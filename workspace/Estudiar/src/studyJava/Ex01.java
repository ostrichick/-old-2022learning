package studyJava;

public class Ex01 {

	public static void main(String[] args) {
		int a; // ���� ���� (����� �ʱ�ȭ���� ������ �����Ⱚ�� �Ҵ�Ǿ��ִ�)
		a = 10; // ���� �����ڸ� �̿��Ͽ� ������ �Ҵ�
		System.out.println(a);
		int b = 10; // ���� ����� ���ÿ� ������ �Ҵ�

		if (a >= 10) {
			int c = 20;
			System.out.println(c);
			System.out.println(a);
		}
		// System.out.println(c); ������ �ڽ��� ����� ���� �ȿ����� ����� �� �ִ�
		System.out.println(a);

		// byte b1 = -129; // byte Ÿ���� 7bit�� ����Ͽ� ���� ǥ���ϹǷ� -128~127�� ������ ���� �� �ִ�

		char c1 = 44032; // �����ڵ� �� 44032�ڵ忡 �ش��ϴ� ����
		char c2 = '��'; // �� ���ڿ� �ش��ϴ� �����ڵ� ��
		// char Ÿ���� ��½� �ش� �����ڵ��� ���ڷ� ��ȯ
		System.out.println(c1);
		System.out.println(c2);

		int c3 = c2; // �ڵ� ����ȯ : ���� ������Ÿ�Կ� ��� ������ ū ������ Ÿ�� ������ ��� ��
		System.out.println(c3);

		long long1 = 2147483648L; // ���ͷ��� ������ Ÿ���� �����ϸ� �⺻ intŸ���̹Ƿ�
		// �� �̻��� �����͸� ǥ���ϱ� ���ؼ��� l �Ǵ� L�� ����ȯ�� �Ѵ�

		float f1 = 3.14f; // ���ͷ� �Ǽ��� double�� �⺻���̹Ƿ� �� ���� ������Ÿ���� float�� ��� ���ؼ� f F�� �̿���

		boolean boo = true;

		final int num = 100;
//		num++; // final Ű����� �������Ǹ� �ش� ������ ���� �ٲ� �� ���� 
		System.out.println(num);
		boo = false;
		a = 20;

		byte byteNum01 = 100;
		short shortNum01 = byteNum01;
		System.out.println(byteNum01);
		System.out.println(shortNum01);
		float floatNum01 = shortNum01;
		System.out.println(floatNum01);
		// �ڵ� ����ȯ ���� ������ Ÿ���� ū ������ Ÿ�Կ� �ƹ��� ��� ���� ���ϴ� ��
		// �ڵ� ����ȯ�� ���� �޸𸮿� ���ؼ��� 0���� ä���. (��ȣ�δ� ����)
		// ��ȣ�δ� ���� ������Ÿ�� �޸𸮸� ����

		byte byteNum02 = 10;
		byte byteNum03 = 127;

		// ���� ���꿡�� �ٸ� ������Ÿ�Գ��� ������ ����� int�̹Ƿ� int�� �ڵ� ����ȯ
		int result = byteNum02 + byteNum03;

		int intNum02 = 127;
		byteNum03 = (byte) intNum02;

		// ū Ÿ���� �����͸� ���� Ÿ�Կ� ���� ��� ���� ����ȯ�� �ϴµ�
		// �̶� ���� ������ Ÿ������ ���� �� ���� �޸𸮴� ������ ������ ���� �� ����
		int intNum03 = 128;
		byteNum03 = (byte) intNum03;
		System.out.println(byteNum03);

		int year = 2018;

		char ch1 = 'Z';
		System.out.println(ch1);
		System.out.println((int) ch1);
		char ch2 = 36;
		System.out.println(ch2);
		System.out.println((int) ch2);
		char ch3 = 97;
		System.out.println(ch3);
		System.out.println((int) ch3);

		final int MAX_NUM = 100;
		final int MIN_NUM;

		MIN_NUM = 0;

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		final int MY_AGE = 22;
		System.out.println(MY_AGE);

	}

}
