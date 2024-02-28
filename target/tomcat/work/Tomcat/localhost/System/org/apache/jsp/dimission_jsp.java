/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-27 07:37:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dimission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>离职申请</title>\r\n");
      out.write("    <link href=\"css/afl.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"app\">\r\n");
      out.write("    <el-menu\r\n");
      out.write("            :default-active=\"activeIndex\"\r\n");
      out.write("            class=\"el-menu-demo\"\r\n");
      out.write("            empty-text=\"暂无数据\"\r\n");
      out.write("            mode=\"horizontal\"\r\n");
      out.write("            @select=\"handleSelect\">\r\n");
      out.write("        <el-menu-item index=\"1\">离职申请</el-menu-item>\r\n");
      out.write("        <el-menu-item index=\"2\" @click=\"checkDimission\">查看申请</el-menu-item>\r\n");
      out.write("\r\n");
      out.write("    <el-form :model=\"ruleForm\" :rules=\"rules\" ref=\"ruleForm\" label-width=\"100px\" class=\"demo-ruleForm\">\r\n");
      out.write("        <el-form-item label=\"姓名\" prop=\"name\" class=\"name\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.name\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"离职原因\" prop=\"reason\" class=\"reason\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.reason\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <el-form-item>\r\n");
      out.write("            <el-button type=\"primary\" class=\"button\" @click=\"dimission\">申请</el-button>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("    </el-form>\r\n");
      out.write("\r\n");
      out.write("    </el-menu>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
      out.write("        el: \"#app\",\r\n");
      out.write("        data() {\r\n");
      out.write("            return {\r\n");
      out.write("                activeIndex: '1',\r\n");
      out.write("                rules: {\r\n");
      out.write("                    name: [\r\n");
      out.write("                        {required: true, message: '请输入姓名', trigger: 'blur'},\r\n");
      out.write("                        {min: 2, max: 5, message: '长度在 2 到 5 个字符', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("                    reason: [\r\n");
      out.write("                        {required: true, message: '请输入离职原因原因', trigger: 'blur'},\r\n");
      out.write("                        {min: 1, max: 100, message: '字数为100字内', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("                },\r\n");
      out.write("                ruleForm: {\r\n");
      out.write("                    username:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("                    name: '',\r\n");
      out.write("                    reason: '',\r\n");
      out.write("                    status:'0'\r\n");
      out.write("                },\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        methods: {\r\n");
      out.write("            dimission(){\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    url:\"http://localhost:8080/System/dimissionServlet\",\r\n");
      out.write("                    data:this.ruleForm\r\n");
      out.write("                }).then(function (resp){\r\n");
      out.write("                    alert(\"提交成功!!\")\r\n");
      out.write("                    location.href=\"http://localhost:8080/System/eHomepageServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            checkDimission(){\r\n");
      out.write("                location.href=\"http://localhost:8080/System/checkDimissionServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
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
