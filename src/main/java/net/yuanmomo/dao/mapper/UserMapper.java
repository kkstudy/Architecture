package net.yuanmomo.dao.mapper;

import java.util.List;

import net.yuanmomo.dao.exception.DefaultDAOException;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserCriteria example) throws DefaultDAOException ;

    int deleteByExample(UserCriteria example) throws DefaultDAOException;

    int deleteByPrimaryKey(Integer id) throws DefaultDAOException;

    int insert(User record) throws DefaultDAOException;

    int insertSelective(User record) throws DefaultDAOException;

    List<User> selectByExample(UserCriteria example) throws DefaultDAOException;

    User selectByPrimaryKey(Integer id) throws DefaultDAOException;

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example) throws DefaultDAOException;

    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example) throws DefaultDAOException;

    int updateByPrimaryKeySelective(User record) throws DefaultDAOException;

    int updateByPrimaryKey(User record) throws DefaultDAOException;
}