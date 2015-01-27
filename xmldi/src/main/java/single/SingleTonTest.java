package single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SingleTonTest {
	
	private final static Logger logger;
	static {
		logger = LoggerFactory.getLogger(SingleTonTest.class);
	}
	
	public static void main(String[] args) {
		SingleTonTest st = new SingleTonTest();
		st.normalCase();
		st.springCase();

	}
	
	private void normalCase() {
		SingleTonDao dao = SingleTonDao.getInstance();
		dao.method();
	}
	
	private void springCase() {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("single_config.xml");
		logger.trace("수업: "+ctx);
		
		// getInstance() 함수를 호출하지 않고
		// bean으로 쓰면 생성자를 호출함
		// getInstance() 함수를 호출하려면 bean에 factory-method를 작성해주면 됨.
		// SingleTonDao를 객체 생성으로 빈을 만들지 않고 factory-method로 만들어 리턴
		SingleTonDao dao = ctx.getBean(SingleTonDao.class);
		dao.method();
		// FactoryBean의 구현체를 빈으로 등록하고 사용하는 경우
		// return 타입은 구현체가 아니라 FactoryBean의 getObject 리턴값
		Object objdao2 = ctx.getBean("single2");
		logger.trace(objdao2.getClass().getName());
		SingleTonDao dao2 = (SingleTonDao) objdao2;
		dao2.method();

	}
}
