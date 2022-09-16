package kkk;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		메서드를 공부하는 팁
//		1. 메서드의 기능 2. 메서드를 호출할 때 넘겨주는 매개변수
//		3. 메서드의 기능이 수행된 후 호출부로 리턴하는 값과 타입
		System.out.println("프로그램의 시작");
		Member m= new Member();
//		개발자가 고객을 정의합니다.
//		고객은 포인트, 아이디, 이름, 비번을 가져야합니다.
//		이런 정보는 자바의 원시타입만으로만 해결이 불가능
//		개발자가 직접 자신에게 맞는 자료형을 만든다
//		이때 자료형은 클래스로 만들고, 전역변수와 메서드로 정의한다.
//		이것을 자바에서는 참조타입으로 분류한다.
		System.out.println(m.point);
		System.out.println(m.pwd);
		m.a(); // 리턴없는 메서드
		m.aa("kkk");//메서드 호출
		m.aa("abc");//리턴값이 있는데 호출부에서 그 리턴값 무시
		int aaa=m.aa("adfa");//리턴값을 받아서 aaa대입
		System.out.println(aaa);
		m.aaa();//리턴값이 있는데 호출부에서 그 리턴값 무시
		String kkkkk=m.aaa();
		System.out.println("프로그램의 종료");
	}

}
