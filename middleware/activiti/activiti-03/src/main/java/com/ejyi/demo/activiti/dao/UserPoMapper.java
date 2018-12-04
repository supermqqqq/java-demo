package com.ejyi.demo.activiti.dao;

import com.ejyi.demo.activiti.dao.po.UserPo;

public interface UserPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    UserPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}