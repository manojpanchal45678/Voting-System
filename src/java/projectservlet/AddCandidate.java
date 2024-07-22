package projectservlet;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet
@MultipartConfig(maxFileSize=609999999)//1.5mb
public class AddCandidate extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Connection con = null;
        PreparedStatement pmt = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> CandidateLogin </title>");
            out.println("</head>");
            out.println("<body>");
            
          /*String cname = request.getParameter("name");
            String fname = request.getParameter("father");
            String mname = request.getParameter("mother");
            String cage = request.getParameter("age");
            String cadd = request.getParameter("address");
            String cparty = request.getParameter("party");*/
           
            
            Part part = request.getPart("file");
            if(part!=null)
            { 
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
            String cname = request.getParameter("name");
            String fname = request.getParameter("father");
            String mname = request.getParameter("mother");
            String ag = request.getParameter("age");
            int cage = Integer.parseInt(ag);    
            String cadd = request.getParameter("address");
            String cparty = request.getParameter("party");
            InputStream is=part.getInputStream();
            pmt = con.prepareStatement("Insert into candidate(name,father,mother,age,address,party,file) values(?,?,?,?,?,?,?)");
            if(cage>=21)
            {
            pmt.setString(1,cname);
            pmt.setString(2, fname);
            pmt.setString(3, mname);
            pmt.setInt(4, cage);
            pmt.setString(5, cadd);
            pmt.setString(6, cparty);
            pmt.setBlob(7, is);
            int i = pmt.executeUpdate();
             if(i==1) {
              response.sendRedirect("projecthtml/Success.html");
            } else {
               response.sendRedirect("projecthtml/Unsuccess.html");
            }
            }else {
                response.sendRedirect("projecthtml/addcandidateagain.html");
//              response.sendRedirect("projecthtml/Unsuccess.html");
            }
            pmt.close();
            con.close();
            out.println("</body>");
            out.println("</html>");
            }
        } catch (ClassNotFoundException | IllegalAccessException | SQLException | InstantiationException ex){
            Logger.getLogger(AddCandidate.class.getName()).log(Level.SEVERE, null, ex);
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
    }// </editor-fold>

}
