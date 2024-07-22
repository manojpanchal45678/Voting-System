package org.apache.jsp.projectjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import projectclasses.Loading;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>HOME PAGE</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"../projectcss/home.css\" type=\"text/css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"../projectcss/home.css\" type=\"text/css\"/> \n");
      out.write(" \n");
      out.write("    </head> \n");
      out.write("    <body> \n");
      out.write("        <div class=\"header\"> \n");
      out.write("            <div class=\"navigation\"> \n");
      out.write("                <img class=\"logo\" src=\"logo.png\"> \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"home.html\">Home</a></li> \n");
      out.write("                    <li><a href=\"voterregistration.html\">Registration</a></li> \n");
      out.write("                    <li><a href=\"voterlogin.html\">Voting</a></li> \n");
      out.write("                    <li><a href=\"ResultData.jsp\">Result</a></li> \n");
      out.write("                    <li><a href=\"adminhome.html\">Admin</a></li> \n");
      out.write("                </ul> \n");
      out.write("            </div> \n");
      out.write("            <div class=\"window\"> \n");
      out.write("                <div class=\"slogan\"> \n");
      out.write("                    <h1>Vote it's</h1> \n");
      out.write("                    <h1>your right</h1> \n");
      out.write("                </div> \n");
      out.write("                <div class=\"image\"> \n");
      out.write("                    <img src=\"bg6.png\" width=\"450px\" height=\"300px\"> \n");
      out.write("                </div> \n");
      out.write("            </div> \n");
      out.write("        </div> \n");
      out.write(" ");

          Loading l = new Loading();
          l.Load();
          Thread t = new Thread(l);
          t.start();
        
      out.write("\n");
      out.write("    </body> \n");
      out.write("</html>\n");
      out.write("    \n");
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
