package com.service;

import com.mapper.ActivityMapper;
import com.pojo.Activity;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ActivityService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Activity> selectAll(){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activities = mapper.selectAll();
        sqlSession.close();

        return  activities;
    }

    public Integer selectByName(String name){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        Integer count = mapper.selectByName(name);
        sqlSession.close();

        return count;
    }

    public Activity selectByNameAndUsername( String username,String name){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        Activity activity = mapper.selectByNameAndUsername(username, name);
        sqlSession.close();

        return activity;

    }

    public void addAttendMenu(String username , String name){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        mapper.addAttendMenu(username,name);
        sqlSession.commit();
        sqlSession.close();

    }


}
