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
		SingleTonDao dao = ctx.getBean(SingleTonDao.class);
		dao.method();
		
	}
}
