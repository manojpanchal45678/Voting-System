package projectservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewAdmin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con=null;
        PreparedStatement pmt=null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>New Admin</title>");            
            out.println("</head>");
            out.println("<body>");
              //response.sendRedirect("projecthtml/newAdmin.html");
             String fname=request.getParameter("fn");
             String lname=request.getParameter("ln");
             String address=request.getParameter("add");
             String password=request.getParameter("pass");
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root","root");
             pmt=con.prepareStatement("Insert into newadmin values(?,?,?,?)");
              pmt.setString(1,fname);
              pmt.setString(2,lname);
              pmt.setString(3,address);
              pmt.setString(4,password);
              int i=pmt.executeUpdate();
              
              if(i==1)
              {
                  response.sendRedirect("projecthtml/newAdminSuccess.html");
              }
              else
              {
                  response.sendRedirect("projecthtml/Unsuccess.html");
              }
              out.println("<center><h1>SAHI HAI.COM</h1></center>");
              pmt.close();
              con.close();
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
