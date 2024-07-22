package org.apache.jsp.projectjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

public final class ResultData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Result Data</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                /* display: flex; */\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                background-color: #040717;\n");
      out.write("                margin: 20px 0 0;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .table-container {\n");
      out.write("                width: 80%;\n");
      out.write("                overflow: auto;\n");
      out.write("                border: 1px solid #1b1f26;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            thead th {\n");
      out.write("                position: -webkit-sticky;\n");
      out.write("                position: sticky;\n");
      out.write("                top: 0;\n");
      out.write("                background-color: #000;\n");
      out.write("                color: #00ccff;\n");
      out.write("                font-size: 15px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                border-bottom: 1px solid #1b1f26;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td img {\n");
      out.write("                height: 60px;\n");
      out.write("                width: 60px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                border: 5px solid #1e1e1e;\n");
      out.write("            }\n");
      out.write("            tbody {\n");
      out.write("                max-height: 400px; /* Set a maximum height for the tbody */\n");
      out.write("                /* overflow-y: auto; Add a vertical scrollbar when the content overflows */\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #0f0f0f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(odd) {\n");
      out.write("                background-color: #0d0d0d;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:hover td {\n");
      out.write("                color: #00ccff;\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: #1b1f26;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td button {\n");
      out.write("                border: none;\n");
      out.write("                padding: 7px 20px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                background-color: #000;\n");
      out.write("                color: #00ccff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* ::-webkit-scrollbar {\n");
      out.write("                width: 6px;\n");
      out.write("            }\n");
      out.write("            ::-webkit-scrollbar-track {\n");
      out.write("                -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);\n");
      out.write("            } */\n");
      out.write("            /* \n");
      out.write("            ::-webkit-scrollbar-thumb {\n");
      out.write("                -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);\n");
      out.write("            } */\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header_fixed\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr> \n");
      out.write("                        <th>S No.</th>\n");
      out.write("                        <th>Party Logo</th>\n");
      out.write("                        <th>Party Name</th>\n");
      out.write("                        <th>Candidate Name</th>\n");
      out.write("                        <th>Vote</th>\n");
      out.write("                        <th>Result Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    int count = 0;
                    Connection con = null;
                    Statement st = null;
                    ResultSet rs = null;
           
                    try {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
                        st = con.createStatement();
                        rs = st.executeQuery("select * from candidate");
                        while (rs.next()) {

                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rs.getInt("id"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getBlob(8));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(7));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                        <td>  </td>\n");
      out.write("                        <td> </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                        }
                    } catch (Exception ex) {
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
