package single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleTonDao {
	
	private final static Logger logger;
	static{
		logger = LoggerFactory.getLogger(SingleTonDao.class);
	}
	
	private static SingleTonDao instance = new SingleTonDao();
	
	private SingleTonDao() {}
	
	// 외부에서 호출할 때는 생성자가 아닌 getInstance()함수가 먼저 실행됨.
	public static SingleTonDao getInstance() {
		logger.trace("리턴하기 전에 어떤 작업???");
		return instance;
	}
	
	public void method() {
		logger.trace("method 호출");
	}
}
