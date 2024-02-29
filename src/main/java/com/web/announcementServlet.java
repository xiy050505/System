package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.Announcement;
import com.service.AnnouncementService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/announcementServlet")
public class announcementServlet extends HttpServlet {
    private AnnouncementService service = new AnnouncementService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Announcement> announcements = service.selectAll();
        String jsonString = JSON.toJSONString(announcements);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
