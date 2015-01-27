package xmldi.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentdaoImpl implements ICommentDao {

	private final static Logger logger;
	private String serverIp;
	private String user;
	
	public CommentdaoImpl() {
		logger.trace("수업: 기본 생성자 호출 됨");
	}
	
	public CommentdaoImpl(String ip, String user) {
		logger.trace("수업: 파라미터 생성자 호출 됨");
		this.serverIp = ip;
		this.user = user;
	}
	
	static {
		logger = LoggerFactory.getLogger(CommentdaoImpl.class);
	}
	
	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CommentdaoImpl [serverIp=" + serverIp + ", user=" + user + "]";
	}

	@Override
	public void addComment() {
		// TODO Auto-generated method stub
		logger.trace("수업: add comment 호출됨");
	}

	@Override
	public void updateComment() {
		// TODO Auto-generated method stub
		logger.trace("수업: update comment 호출됨");
	}

	@Override
	public void deleteComment() {
		// TODO Auto-generated method stub
		logger.trace("수업: delete comment 호출됨");
	}

	@Override
	public void selectComment() {
		// TODO Auto-generated method stub
		logger.trace("수업: select comment 호출됨");
		
	}

}
