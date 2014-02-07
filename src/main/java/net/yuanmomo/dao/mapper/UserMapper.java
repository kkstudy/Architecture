package net.yuanmomo.dao.mapper;

import java.util.List;

import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.exception.DAOException;

public interface UserMapper {

    public int  insert(User user) throws DAOException;

    public int  insertSelective(User user) throws DAOException;

    public List<User> selectByExample(UserCriteria example) throws DAOException;
}