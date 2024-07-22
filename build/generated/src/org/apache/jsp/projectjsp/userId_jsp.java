package org.apache.jsp.projectjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import projectclasses.Loading;
import projectclasses.RegistrationV;

public final class userId_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html lang=\"en\"> \n");
      out.write("<head> \n");
      out.write("    <meta charset=\"UTF-8\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("    <title>Registration Successful</title> \n");
      out.write("    <style> \n");
      out.write("        body { \n");
      out.write("            font-family: Arial, sans-serif; \n");
      out.write("            background-color: #f2f2f2; \n");
      out.write("            display: flex; \n");
      out.write("            justify-content: center; \n");
      out.write("            align-items: center; \n");
      out.write("            height: 100vh; \n");
      out.write("            margin: 0; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #popup { \n");
      out.write("            display: flex; \n");
      out.write("            flex-direction: column; \n");
      out.write("            align-items: center; \n");
      out.write("            width: 300px; \n");
      out.write("            padding: 20px; \n");
      out.write("            background-color: #fff; \n");
      out.write("            border-radius: 5px; \n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); \n");
      out.write("            text-align: center; \n");
      out.write("            position: relative; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #popup.active { \n");
      out.write("            display: block; \n");
      out.write("            animation: fadeIn 0.5s; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #check-icon { \n");
      out.write("            font-size: 48px; \n");
      out.write("            color: #4CAF50; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #message { \n");
      out.write("            font-weight: bold; \n");
      out.write("            margin: 20px 0; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #redirect-link { \n");
      out.write("            display: inline-block; \n");
      out.write("            background-color: #007BFF; \n");
      out.write("            color: #fff; \n");
      out.write("            padding: 10px 20px; \n");
      out.write("            border-radius: 5px; \n");
      out.write("            text-decoration: none; \n");
      out.write("            cursor: pointer; \n");
      out.write("            transition: background-color 0.3s; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        #redirect-link:hover { \n");
      out.write("            background-color: #0056b3; \n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        @keyframes fadeIn { \n");
      out.write("            from { \n");
      out.write("                opacity: 0; \n");
      out.write("                transform: translateY(-20px); \n");
      out.write("            } \n");
      out.write("            to { \n");
      out.write("                opacity: 1; \n");
      out.write("                transform: translateY(0); \n");
      out.write("            } \n");
      out.write("        } \n");
      out.write("    </style> \n");
      out.write("</head> \n");
      out.write("<body> \n");
      out.write("    <div id=\"popup\" class=\"active\"> \n");
      out.write("        <div id=\"check-icon\">&#10004;</div> \n");
      out.write("        <div id=\"message\"> \n");
      out.write("            Congratulations! \n");
      out.write("        </div> \n");
      out.write("        <p>Your registration was successful.</p> \n");
      out.write("        ");
  RegistrationV r = (RegistrationV)request.getAttribute("reg");
      out.write(" \n");
      out.write("        <b>");
  out.println("Your user ID = "+r.getCid());
      out.write("</b> \n");
      out.write("               \n");
      out.write("        <p style=\"color:red\"> \n");
      out.write("            <b>Note This ID!</b> \n");
      out.write("        </p> \n");
      out.write("          <div style=\"margin-top: 20px;\"><a id=\"redirect-link\" href=\"projecthtml/home.html\">OK</a></div> \n");
      out.write("    </div> \n");
      out.write("</body> \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
