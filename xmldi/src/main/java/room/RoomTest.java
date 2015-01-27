package room;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RoomTest {
	
	private final static Logger logger;
	static {
		logger = LoggerFactory.getLogger(RoomTest.class);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"room_config.xml");
		
		/*Room room = ctx.getBean(Room.class);
		logger.trace("수업: "+room);*/
		
		Room room2 = ctx.getBean("myRoom", Room.class);
		logger.trace("수업: "+room2);

		Room room3 = ctx.getBean("yourRoom", Room.class);
		logger.trace("수업: "+room3);

	}
}
