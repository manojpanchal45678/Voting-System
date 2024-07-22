package org.apache.jsp.projectjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class bollet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html lang=\"en\"> \n");
      out.write("<head> \n");
      out.write("    <meta charset=\"UTF-8\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("    <title>Voting Ballot</title> \n");
      out.write("    <style> \n");
      out.write("        body { \n");
      out.write("            background-color: #1f2937; /* Dark background color */ \n");
      out.write("            color: #fff; \n");
      out.write("            font-family: Arial, sans-serif; \n");
      out.write("            text-align: center; \n");
      out.write("            align-content: center; \n");
      out.write("        } \n");
      out.write("        table { \n");
      out.write("            width: 80%; \n");
      out.write("            margin: 20px; \n");
      out.write("            border-collapse: collapse; \n");
      out.write(" \n");
      out.write("        } \n");
      out.write("        th, td { \n");
      out.write("            border: 2px solid #1f2937; \n");
      out.write("            padding: 10px; \n");
      out.write("        } \n");
      out.write("        th { \n");
      out.write("            background-color: #334155; \n");
      out.write("            color: #fff; \n");
      out.write("        } \n");
      out.write("        td { \n");
      out.write("            background-color: #28a745; /* Green color for selected candidates */ \n");
      out.write("        } \n");
      out.write("        .vote-button { \n");
      out.write("            background-color: #28a745; /* Green color for vote buttons */ \n");
      out.write("            color: #fff; \n");
      out.write("            border: none; \n");
      out.write("            padding: 10px 20px; \n");
      out.write("            font-size: 16px; \n");
      out.write("            border-radius: 5px; \n");
      out.write("            cursor: pointer; \n");
      out.write("            display: none; /* Initially hidden */ \n");
      out.write("        } \n");
      out.write("        .selected .vote-button { \n");
      out.write("            display: block; /* Display when the candidate is selected */ \n");
      out.write("        } \n");
      out.write("        .vote-button:hover { \n");
      out.write("            background-color: #1f2937; /* Darker color on hover */ \n");
      out.write("        } \n");
      out.write("        .radio-button { \n");
      out.write("            display: none; \n");
      out.write("        } \n");
      out.write("        .radio-label { \n");
      out.write("            display: block; \n");
      out.write("            width: 100%; \n");
      out.write("            padding: 10px; \n");
      out.write("            cursor: pointer; \n");
      out.write("            text-align: center; \n");
      out.write("        } \n");
      out.write("        .radio-label input[type=\"radio\"]:checked + .vote-button { \n");
      out.write("            display: block; \n");
      out.write("        } \n");
      out.write("    </style> \n");
      out.write("</head> \n");
      out.write("<body> \n");
      out.write("    <h1>Voting Ballot</h1> \n");
      out.write("    <table> \n");
      out.write("        <thead> \n");
      out.write("            <tr> \n");
      out.write("                <th>Serial Number</th> \n");
      out.write("                <th>Candidate Logo</th> \n");
      out.write("                <th>Candidate Name</th> \n");
      out.write("                <th>Submit Vote</th> \n");
      out.write("            </tr> \n");
      out.write("        </thead> \n");
      out.write("        ");

            int count=0;
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root" ,"root");
                st=con.createStatement();
                rs=st.executeQuery("select * from candidate");
                while(rs.next())
                {
                    
               
      out.write("\n");
      out.write("              \n");
      out.write("        <tbody> \n");
      out.write("            <!-- Candidate 1 --> \n");
      out.write("            <tr> \n");
      out.write("                <td>");
      out.print( rs.getInt("id"));
      out.write("</td> \n");
      out.write("                <td>");
      out.print( rs.getBlob(8));
      out.write("</td> \n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td> \n");
      out.write("                <td> \n");
      out.write("                    <label class=\"radio-label\"> \n");
      out.write("                        <input type=\"radio\" name=\"candidate\" class=\"radio-button\"> \n");
      out.write("                        <div class=\"vote-button\">Submit Vote</div> \n");
      out.write("                        <div>Click here to vote</div> \n");
      out.write("                    </label> \n");
      out.write("                </td>                   \n");
      out.write("            </tr>\n");
      out.write("        </tbody> \n");
      out.write("         ");
   
                }
            }catch(Exception ex){}
        
      out.write("\n");
      out.write("    </table> \n");
      out.write(" \n");
      out.write("    <script> \n");
      out.write("        const radioButtons = document.querySelectorAll('.radio-button'); \n");
      out.write("         \n");
      out.write("        radioButtons.forEach((radio) => { \n");
      out.write("            radio.addEventListener('change', (event) => { \n");
      out.write("                if (event.target.checked) { \n");
      out.write("                    // Unselect all other rows \n");
      out.write("                    radioButtons.forEach((rb) => { \n");
      out.write("                        rb.closest('tr').classList.remove('selected'); \n");
      out.write("                    }); \n");
      out.write("                     \n");
      out.write("                    // Select the row \n");
      out.write("                    event.target.closest('tr').classList.add('selected'); \n");
      out.write("                } \n");
      out.write("            }); \n");
      out.write("        }); \n");
      out.write("    </script> \n");
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
