package single;

import org.springframework.beans.factory.FactoryBean;

public class SingleTonDaoFactoryBean implements FactoryBean<SingleTonDao> {

	@Override
	public SingleTonDao getObject() throws Exception {
		// TODO Auto-generated method stub
		SingleTonDao dao = SingleTonDao.getInstance();
		return dao;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}



}
