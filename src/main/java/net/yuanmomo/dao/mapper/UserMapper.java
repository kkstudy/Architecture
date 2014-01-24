package net.yuanmomo.dao.mapper;

import java.util.List;

import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.exception.DAOException;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public int  countByExample(UserCriteria example) throws DAOException,Exception ;

    public int  deleteByExample(UserCriteria example) throws DAOException,Exception;

    public int  deleteByPrimaryKey(Integer id) throws DAOException,Exception;

    public int  insert(User record) throws DAOException,Exception;

    public int  insertSelective(User record) throws DAOException,Exception;

    public List<User> selectByExample(UserCriteria example) throws DAOException,Exception;

    public User selectByPrimaryKey(Integer id) throws DAOException,Exception;

    public int  updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example) throws DAOException,Exception;

    public int  updateByExample(@Param("record") User record, @Param("example") UserCriteria example) throws DAOException,Exception;

    public int  updateByPrimaryKeySelective(User record) throws DAOException,Exception;

    public int  updateByPrimaryKey(User record) throws DAOException,Exception;
}