package kkk;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�޼��带 �����ϴ� ��
//		1. �޼����� ��� 2. �޼��带 ȣ���� �� �Ѱ��ִ� �Ű�����
//		3. �޼����� ����� ����� �� ȣ��η� �����ϴ� ���� Ÿ��
		System.out.println("���α׷��� ����");
		Member m= new Member();
//		�����ڰ� ���� �����մϴ�.
//		���� ����Ʈ, ���̵�, �̸�, ����� �������մϴ�.
//		�̷� ������ �ڹ��� ����Ÿ�Ը����θ� �ذ��� �Ұ���
//		�����ڰ� ���� �ڽſ��� �´� �ڷ����� �����
//		�̶� �ڷ����� Ŭ������ �����, ���������� �޼���� �����Ѵ�.
//		�̰��� �ڹٿ����� ����Ÿ������ �з��Ѵ�.
		System.out.println(m.point);
		System.out.println(m.pwd);
		m.a(); // ���Ͼ��� �޼���
		m.aa("kkk");//�޼��� ȣ��
		m.aa("abc");//���ϰ��� �ִµ� ȣ��ο��� �� ���ϰ� ����
		int aaa=m.aa("adfa");//���ϰ��� �޾Ƽ� aaa����
		System.out.println(aaa);
		m.aaa();//���ϰ��� �ִµ� ȣ��ο��� �� ���ϰ� ����
		String kkkkk=m.aaa();
		System.out.println("���α׷��� ����");
	}

}
