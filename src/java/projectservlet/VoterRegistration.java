package projectservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projectclasses.RegistrationV;
public class VoterRegistration extends HttpServlet {
    static int count =0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection con=null;
        PreparedStatement pmt=null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String cname = request.getParameter("vname");
            String fname = request.getParameter("father");
            String ag = request.getParameter("age");
            int cage = Integer.parseInt(ag);
            String pass = request.getParameter("password");
                 
            
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
                pmt = con.prepareStatement("Insert into voter(name,father,age,password,cid) values(?,?,?,?,?)");
                if(cage>=18)
               {
                count++;
                String cid ="user"+count+cname.charAt(0)+ag;
                RegistrationV r= new RegistrationV(cid);
                request.setAttribute("reg",r);
                pmt.setString(1, cname);
                pmt.setString(2, fname);
                pmt.setInt(3,cage);
                pmt.setString(4, pass);
                pmt.setString(5,cid);
                int i = pmt.executeUpdate(); 
                if(i==1)
                {
                    RequestDispatcher rd= request.getRequestDispatcher("projectjsp/userId.jsp"); 
                    rd.forward(request,response);
                }
                 else
                 {
                   RequestDispatcher rd= request.getRequestDispatcher("projecthtml/Unsuccess.html"); 
                    rd.forward(request,response);
                 }  
                 pmt.close();
                 con.close();
               } 
               else
                 {                
                       response.sendRedirect("projecthtml/Unsuccess.html");
                       }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(VoterRegistration.class.getName()).log(Level.SEVERE, null, ex);
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
        return "Short description";}
}
