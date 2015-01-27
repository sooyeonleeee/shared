package xmldi.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import xmldi.dao.ICommentDao;
import xmldi.service.CommentServiceImpl;
import xmldi.service.IService;

public class ContextTest {

	private final static Logger logger;
	static {
		logger = LoggerFactory.getLogger(ContextTest.class);
	}

	public static void main(String[] args) {
		// xml파일의 경로명 쓰기
		// di container : GenericXmlApplicationContext
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"application_context.xml");
		logger.trace("수업: " + ctx);
		//앞에 id를 써주면 지정한 bean을 가져옴.
		ICommentDao dao = ctx.getBean("runtimecommentDao", ICommentDao.class);
		logger.trace("수업: "+dao);
		
		Object objdao = ctx.getBean("runtimecommentDao");
		ICommentDao dao2 = (ICommentDao) objdao;
		logger.trace("수업: "+dao2);
		
		IService service = ctx.getBean(IService.class);
		logger.trace("수업: "+service);
		IService service2 = ctx.getBean(IService.class);
		logger.trace("수업: "+service2);
		IService service3 = ctx.getBean(CommentServiceImpl.class);
		logger.trace("수업: "+service3);
		// reference되는 수는 1개(singleton)
		// bean만 등록하면 spring내부적으로 한 개의 객체로만 관리해줌
	}

}


