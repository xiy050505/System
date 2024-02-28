package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.Activity;
import com.service.ActivityService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/attendActivityServlet")
public class attendActivityServlet extends HttpServlet {
    private ActivityService service = new ActivityService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        Activity activity = JSON.parseObject(params, Activity.class);
        String currentRow = activity.getCurrentRow();
        String[] split = currentRow.split("\"");
        String s = split[7];
        Activity activity1 = service.selectByNameAndUsername(activity.getUsername(), s);
        if (activity1==null){
            service.addAttendMenu(activity.getUsername(),s);
            response.getWriter().write("success");
        } else {
            response.getWriter().write("failure");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
