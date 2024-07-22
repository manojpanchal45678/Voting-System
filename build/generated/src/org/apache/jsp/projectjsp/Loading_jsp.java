package org.apache.jsp.projectjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import projectclasses.Loading;

public final class Loading_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Animated Loader</title>\n");
      out.write("<!--    <link rel=\"stylesheet\" href=\"./styles.css\">-->\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    height: 100vh;\n");
      out.write("    width: 100%;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    background: #000;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    position: relative;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".ring{\n");
      out.write("    width: 200px;\n");
      out.write("    height: 200px;\n");
      out.write("    border: 0px solid #000;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("}\n");
      out.write(".ring:nth-child(1){\n");
      out.write("    border-bottom-width: 8px;\n");
      out.write("    border-color: rgb(255, 255, 255);\n");
      out.write("    animation: rotate1 2s linear infinite;\n");
      out.write("    -webkit-animation: rotate1 2s linear infinite;\n");
      out.write("}\n");
      out.write(".ring:nth-child(2){\n");
      out.write("    border-right-width: 8px;\n");
      out.write("    border-color: rgb(248, 95, 7);\n");
      out.write("    animation: rotate2 2s linear infinite;\n");
      out.write("    -webkit-animation: rotate2 2s linear infinite;\n");
      out.write("}\n");
      out.write(".ring:nth-child(3){\n");
      out.write("    border-top-width: 8px;\n");
      out.write("    border-color: rgb(18, 240, 40);\n");
      out.write("    animation: rotate3 2s linear infinite;\n");
      out.write("    -webkit-animation: rotate3 2s linear infinite;\n");
      out.write("}\n");
      out.write(".loading{\n");
      out.write("    color: #2acaff;\n");
      out.write("    font-family: 'Courier New', Courier, monospace;\n");
      out.write("}\n");
      out.write("@keyframes rotate1{\n");
      out.write("    0%{\n");
      out.write("        transform: rotateX(35deg) rotateY(-45deg) rotateZ(0deg);\n");
      out.write("}\n");
      out.write("    100%{\n");
      out.write("        transform: rotateX(35deg) rotateY(-45deg) rotateZ(360deg);\n");
      out.write("}\n");
      out.write("}\n");
      out.write("@keyframes rotate2{\n");
      out.write("    0%{\n");
      out.write("        transform: rotateX(50deg) rotateY(10deg) rotateZ(0deg);\n");
      out.write("}\n");
      out.write("    100%{\n");
      out.write("        transform: rotateX(50deg) rotateY(10deg) rotateZ(360deg);\n");
      out.write("}\n");
      out.write("}\n");
      out.write("@keyframes rotate3{\n");
      out.write("    0%{\n");
      out.write("        transform: rotateX(35deg) rotateY(55deg) rotateZ(0deg);\n");
      out.write("}\n");
      out.write("    100%{\n");
      out.write("        transform: rotateX(35deg) rotateY(55deg) rotateZ(360deg);\n");
      out.write("}\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"ring\"></div>\n");
      out.write("        <div class=\"ring\"></div>\n");
      out.write("        <div class=\"ring\"></div>\n");
      out.write("        <span class=\"loading\">Loading...</span>\n");
      out.write("    </div>\n");
      out.write("   ");

          Loading l = new Loading();
          l.Load();
          Thread t = new Thread(l);
          t.start();
        
      out.write("\n");
      out.write("       \n");
      out.write("</body>\n");
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
