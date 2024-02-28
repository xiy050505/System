/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-28 04:42:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>个人信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"app\">\r\n");
      out.write("    <el-form :model=\"ruleForm\" :rules=\"rules\" ref=\"ruleForm\" label-width=\"100px\" class=\"demo-ruleForm\">\r\n");
      out.write("        <el-form-item label=\"用户名\" prop=\"username\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.username\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("        <el-form-item label=\"密码\" prop=\"password\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.password\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("        <el-form-item label=\"确认密码\" prop=\"rpassword\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.rpassword\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"验证码\" prop=\"checkCode\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.checkCode\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("        \r\n");
      out.write("        <el-form-item>\r\n");
      out.write("            <el-button type=\"primary\" @click=\"register\">注册</el-button>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("    </el-form>\r\n");
      out.write("</div>\r\n");
      out.write("<img src=\"/System/checkCodeServlet\" id=\"checkCode\">\r\n");
      out.write("<a href=\"#\" id=\"changeImg\">看不清?</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/axios-0.18.0.js\"></script>\r\n");
      out.write("<script src=\"js/vue.js\"></script>\r\n");
      out.write("<script src=\"element-ui/lib/index.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"element-ui/lib/theme-chalk/index.css\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    new Vue({\r\n");
      out.write("        el:\"#app\",\r\n");
      out.write("        data() {\r\n");
      out.write("            return {\r\n");
      out.write("                ruleForm: {\r\n");
      out.write("                    username:'',\r\n");
      out.write("                    password:'',\r\n");
      out.write("                    rpassword:'',\r\n");
      out.write("                    checkCode:''\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                rules: {\r\n");
      out.write("                    username: [\r\n");
      out.write("                        {required: true, message: '请输入用户名', trigger: 'blur'},\r\n");
      out.write("                        {min: 4, max: 8, message: '长度在 4 到 8 个字符', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("                    password: [\r\n");
      out.write("                        {required: true, message: '请输入密码', trigger: 'blur'},\r\n");
      out.write("                        {min: 8, max: 12, message: '长度在 8到 12 个字符', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("                    rpassword: [\r\n");
      out.write("                        {required: true, message: '请再次输入密码', trigger: 'blur'},\r\n");
      out.write("                        {min: 8, max: 12, message: '长度在 8到 12 个字符', trigger: 'blur'}\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        methods:{\r\n");
      out.write("            register(){\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    url:\"http://localhost:8080/System/registerServlet\",\r\n");
      out.write("                    data:this.ruleForm\r\n");
      out.write("                }).then(function (resp){\r\n");
      out.write("                    if (resp.data===\"success\"){\r\n");
      out.write("                        alert(\"注册成功!\");\r\n");
      out.write("                    } else if (resp.data===\"checkCodeFailure\"){\r\n");
      out.write("                        alert(\"验证码错误!\")\r\n");
      out.write("                    } else if(resp.data===\"passwordFailure\"){\r\n");
      out.write("                        alert(\"两次输入的密码不匹配!\")\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"用户名已存在!\")\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"changeImg\").onclick = function (){\r\n");
      out.write("        document.getElementById(\"checkCode\").src=\"/System/checkCodeServlet?\"+new Date().getMilliseconds();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}