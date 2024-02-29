package com.service;

import com.mapper.AnnouncementMapper;
import com.pojo.Announcement;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AnnouncementService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    public List<Announcement> selectAll(){
        SqlSession sqlSession = factory.openSession();
        AnnouncementMapper mapper = sqlSession.getMapper(AnnouncementMapper.class);
        List<Announcement> announcements = mapper.selectAll();
        sqlSession.close();
        return announcements;
    }
}
