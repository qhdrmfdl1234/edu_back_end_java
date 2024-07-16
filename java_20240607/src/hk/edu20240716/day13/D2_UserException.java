package hk.edu20240716.day13;

public class D2_UserException extends Exception{
	public D2_UserException() {
	   this("UserExcetion 오류입니다");
	}
	public D2_UserException(String msg) {
		super(msg);//부모생성자한테 메세지 전달
	}
}
