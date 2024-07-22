
package projectservlet;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet(urlPatterns = {"/images"})
@MultipartConfig(maxFileSize = 16177216)
public class Images extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Connection con=null;
        Statement dt=null;
        PreparedStatement pmt=null;
        ResultSet rs=null;
        response.setContentType("text/html;charset=UTF-8");
           /* 
            try (PrintWriter out = response.getWriter()) {
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Images</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Servlet Images at " + request.getContextPath() + "</h1>");
            
            int result = 0;
            Part part =request.getPart("file");
            if(part!=null){
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
            pmt=con.prepareStatement("insert into image values(?)");
            InputStream is=part.getInputStream();
            
            pmt.setBlob(1,is);
            result=pmt.executeUpdate();
            }
            out.println("image saved succesfully");
            out.println("</body>");
            out.println("</html>");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           Part part = request.getPart("file");
           String fileFileName = part.getSubmittedFileName();
           System.out.println("The file is ="+fileFileName);
   
    }
}

