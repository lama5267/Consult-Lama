/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-04 14:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;text/css;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!Doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("     <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Вход в систему</title>\r\n");
      out.write("        <link type='text/css' href=\"css/login2.css\" rel=\"stylesheet\" id=\"login2-css\">\r\n");
      out.write("             \t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write(" <!---heading---->\r\n");
      out.write("     <header class=\"heading\"> Registration-Form</header><hr></hr>\r\n");
      out.write("\t<!---Form starting---->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row \">\r\n");
      out.write("\t <!--- For Name---->\r\n");
      out.write("         <div class=\"col-sm-12\">\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("\t\t\t     <div class=\"col-xs-4\">\r\n");
      out.write("          \t         <label class=\"firstname\">First Name :</label> </div>\r\n");
      out.write("\t\t         <div class=\"col-xs-8\">\r\n");
      out.write("\t\t             <input type=\"text\" name=\"fname\" id=\"fname\" placeholder=\"Enter your First Name\" class=\"form-control \">\r\n");
      out.write("             </div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <div class=\"col-sm-12\">\r\n");
      out.write("\t\t     <div class=\"row\">\r\n");
      out.write("\t\t\t     <div class=\"col-xs-4\">\r\n");
      out.write("                     <label class=\"lastname\">Last Name :</label></div>\r\n");
      out.write("\t\t\t\t<div class =\"col-xs-8\">\r\n");
      out.write("\t\t             <input type=\"text\" name=\"lname\" id=\"lname\" placeholder=\"Enter your Last Name\" class=\"form-control last\">\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t <div class=\"col-sm-12\">\r\n");
      out.write("         \t\t     <div class=\"row\">\r\n");
      out.write("         \t\t\t     <div class=\"col-xs-4\">\r\n");
      out.write("                              <label class=\"lastname2\">Last Name :</label></div>\r\n");
      out.write("         \t\t\t\t<div class =\"col-xs-8\">\r\n");
      out.write("         \t\t             <input type=\"text\" name=\"lname\" id=\"lname\" placeholder=\"Enter your Last Name\" class=\"form-control last\">\r\n");
      out.write("                         </div>\r\n");
      out.write("         \t\t     </div>\r\n");
      out.write("         \t\t </div>\r\n");
      out.write("     <!-----For email---->\r\n");
      out.write("\t\t <div class=\"col-sm-12\">\r\n");
      out.write("\t\t     <div class=\"row\">\r\n");
      out.write("\t\t\t     <div class=\"col-xs-4\">\r\n");
      out.write("\t\t             <label class=\"mail\" >Email :</label></div>\r\n");
      out.write("\t\t\t     <div class=\"col-xs-8\"\t>\r\n");
      out.write("\t\t\t          <input type=\"email\" name=\"email\"  id=\"email\"placeholder=\"Enter your email\" class=\"form-control\" >\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t <!-----For Password and confirm password---->\r\n");
      out.write("          <div class=\"col-sm-12\">\r\n");
      out.write("\t\t         <div class=\"row\">\r\n");
      out.write("\t\t\t\t     <div class=\"col-xs-4\">\r\n");
      out.write("\t\t \t              <label class=\"pass\">Password :</label></div>\r\n");
      out.write("\t\t\t\t  <div class=\"col-xs-8\">\r\n");
      out.write("\t\t\t             <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Enter your Password\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\r\n");
      out.write("     <!-----------For Phone number-------->\r\n");
      out.write("         <div class=\"col-sm-12\">\r\n");
      out.write("\t\t     <div class =\"row\">\r\n");
      out.write("                 <div class=\"col-xs-4 \">\r\n");
      out.write("\t\t\t       <label class=\"gender\">Gender:</label>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t     <div class=\"col-xs-4 male\">\r\n");
      out.write("\t\t\t\t     <input type=\"radio\" name=\"gender\"  id=\"gender\" value=\"boy\">Male</input>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t <div class=\"col-xs-4 female\">\r\n");
      out.write("\t\t\t\t     <input type=\"radio\"  name=\"gender\" id=\"gender\" value=\"girl\" >Female</input>\r\n");
      out.write("\t\t\t     </div>\r\n");
      out.write("\r\n");
      out.write("\t\t  \t </div>\r\n");
      out.write("\t\t  \t <form method=\"post\" action=\"/auth\">\r\n");
      out.write("                                <div class=\"input-group mb-3\">\r\n");
      out.write("                                    <div class=\"input-group-append\">\r\n");
      out.write("                                        <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" name=\"login\" class=\"form-control input_user\" value=\"\" placeholder=\"username\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group mb-2\">\r\n");
      out.write("                                    <div class=\"input-group-append\">\r\n");
      out.write("                                        <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"password\" name=\"password\" class=\"form-control input_pass\" value=\"\" placeholder=\"password\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customControlInline\">\r\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"customControlInline\">Remember me</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"d-flex justify-content-center mt-3 login_container\">\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn login_btn\" value=\"Log In\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("         <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/show1\">Главная</a>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
