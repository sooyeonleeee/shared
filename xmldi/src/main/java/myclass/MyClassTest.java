package myclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyClassTest {
	
	private final static Logger logger;
	static {
		logger = LoggerFactory.getLogger(MyClassTest.class);
	}
	
	public static void main(String[] args) {
		//context.xml 파일 생성 후 myclass와 student 빈 등록
		
		//applicationcontext 객체 생성 후 생성 확인
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"class_config.xml");
		logger.trace("수업: "+ctx);
		
		Student std = ctx.getBean(Student.class);
		logger.trace("수업: "+std);
		
		MyClass mc = ctx.getBean(MyClass.class);
		logger.trace("수업: "+mc);
		
		
		//myclass 빈을 얻어와서 정보 출력
		
		
	}
}
