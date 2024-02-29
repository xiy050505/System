/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-29 06:40:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addActivity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>新增活动</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"app\">\r\n");
      out.write("    <el-form :model=\"ruleForm\" :rules=\"rules\" ref=\"ruleForm\" label-width=\"100px\" class=\"demo-ruleForm\">\r\n");
      out.write("        <el-form-item label=\"活动名称\" prop=\"name\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.name\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"活动时间\" required>\r\n");
      out.write("            <el-col :span=\"5\">\r\n");
      out.write("                <el-form-item >\r\n");
      out.write("                    <el-date-picker\r\n");
      out.write("                            v-model=\"ruleForm.startTime\"\r\n");
      out.write("                            type=\"date\"\r\n");
      out.write("                            placeholder=\"选择日期\"\r\n");
      out.write("                            value-format=\"yyyy-MM-dd\">\r\n");
      out.write("                    </el-date-picker>\r\n");
      out.write("\r\n");
      out.write("                </el-form-item>\r\n");
      out.write("            </el-col>\r\n");
      out.write("            <el-col class=\"line\" :span=\"1\"> 至</el-col>\r\n");
      out.write("            <el-col :span=\"5\">\r\n");
      out.write("                <el-form-item >\r\n");
      out.write("                    <el-date-picker type=\"date\"\r\n");
      out.write("                                    placeholder=\"选择结束时间\"\r\n");
      out.write("                                    v-model=\"ruleForm.endTime\"\r\n");
      out.write("                                    value-format=\"yyyy-MM-dd\"\r\n");
      out.write("                                    style=\"width: 100%;\">\r\n");
      out.write("\r\n");
      out.write("                    </el-date-picker>\r\n");
      out.write("                </el-form-item>\r\n");
      out.write("            </el-col>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"活动内容\" prop=\"content\">\r\n");
      out.write("            <el-input v-model=\"ruleForm.content\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item>\r\n");
      out.write("            <el-button type=\"primary\" @click=\"submitForm('ruleForm')\">添加</el-button>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("    </el-form>\r\n");
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
      out.write("                ruleForm: {\r\n");
      out.write("                    name: '',\r\n");
      out.write("                    startTime:'',\r\n");
      out.write("                    endTime: '',\r\n");
      out.write("                    content: '',\r\n");
      out.write("                },\r\n");
      out.write("                rules: {\r\n");
      out.write("                    name: [\r\n");
      out.write("                        {required: true, message: '请输入活动名称', trigger: 'blur'},\r\n");
      out.write("                        {min: 1, max: 10, message: '活动名称长度为10以内', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("                    content: [\r\n");
      out.write("                        {required: true, message: '请输入活动内容', trigger: 'blur'},\r\n");
      out.write("                        {min: 1, max: 100, message: '活动内容不能为空', trigger: 'blur'}\r\n");
      out.write("                    ],\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        methods: {\r\n");
      out.write("            submitForm(formName) {\r\n");
      out.write("                this.$refs[formName].validate((valid) => {\r\n");
      out.write("                    if (valid) {\r\n");
      out.write("                        axios({\r\n");
      out.write("                            method:\"post\",\r\n");
      out.write("                            url:\"http://localhost:8080/System/addActivityServlet\",\r\n");
      out.write("                            data:this.ruleForm\r\n");
      out.write("                        }).then(function (resp){\r\n");
      out.write("                            if (resp.data===\"dateError\"){\r\n");
      out.write("                                alert(\"活动日期选择错误!\")\r\n");
      out.write("                            }\r\n");
      out.write("                            else if (resp.data===\"failure\"){\r\n");
      out.write("                                alert(\"活动名已存在\");\r\n");
      out.write("                            } else {\r\n");
      out.write("                                alert(\"添加成功!\");\r\n");
      out.write("                                location.href=\"checkActivity.jsp\"\r\n");
      out.write("                            }\r\n");
      out.write("                        })\r\n");
      out.write("                    } else {\r\n");
      out.write("                        console.log('error submit!!');\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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
