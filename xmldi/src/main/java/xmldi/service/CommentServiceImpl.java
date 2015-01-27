package xmldi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xmldi.dao.ICommentDao;

public class CommentServiceImpl implements IService {
	
	ICommentDao dao;
	public CommentServiceImpl() {}
	// 필요한 리소스를 외부에서 주입받음
	// (객체를 주입받아서 사용할 수 있도록 함)
	public CommentServiceImpl(ICommentDao dao) {
		this.dao = dao;
	}
	
	private final static Logger logger;
	static {
		logger = LoggerFactory.getLogger(CommentServiceImpl.class);
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		dao.addComment();
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		dao.selectComment();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		dao.deleteComment();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		dao.updateComment();
	}

}
