package hk.edu20240716.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class D2_ExceptionTest {

	public static void main(String[] args) {
		exTest("1234");
		
		try {
			userExcetionTest(12);
		} catch (D2_UserException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	   
	public static void exTest(String s) {
		int i=0;
		String ss="";
		int [] array= {1,2,3,4,5};
		
		try {
			ss=s.substring(0,2);
			i=Integer.parseInt(ss);//<--"5" 숫자형태의 문자열을 받아야한다
			System.out.println(ss);
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();//예외 발생 내용을 출력해주는 기능
			System.out.println("문자열의 길이를 확인하세요");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자형태인지 확인하세요");
		}catch(ArrayIndexOutOfBoundsException ee) {
			ee.printStackTrace();
			System.out.println("배열의 인덱스를 확인하새요");
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			System.out.println("예외와 상관없이 반드시 처리해야할 코드");
		}
	}    
	
	//사용자 예외처리: 예외를 던지기로 구현
	public static void userExcetionTest(int a) throws D2_UserException {
		//a는 1~10까지의 숫자만 전달받을 수 있다.
		if(!(a>0&&a<11)) { // 1~10의 범위를 벗어난 숫자를 받았을 경우
			throw new D2_UserException("1부터 10까지의 숫자만 입력하세요");
			
		}
		
		

		
	}
	
	public void test01() throws IOException{
		InputStreamReader in= new InputStreamReader(null);
		in.read();
	}
	

}

