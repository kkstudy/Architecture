package net.yuanmomo.business;

import net.yuanmomo.dao.mapper.vo.TestBean;
import net.yuanmomo.mybatis.mapper.TestMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestBusiness{
	private Logger logger=Logger.getLogger(TestBusiness.class);
	
	@Autowired
	private TestMapper testMapper=null;

	//*********    setter and getter   *************//
	public TestMapper getTestMapper() {
		return testMapper;
	}

	public void setTestMapper(TestMapper testMapper) {
		this.testMapper = testMapper;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
	public boolean insert(User t) throws Exception {
		logger.debug("Start to insert record.......");
		int count=testMapper.insert(t);
		logger.debug("Insert record finished.......");
		return count>0 ? true : false;
	}
}
