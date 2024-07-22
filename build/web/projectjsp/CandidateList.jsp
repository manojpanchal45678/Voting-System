
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidate LIst</title>
        <style>
            *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    /* display: flex; */
    justify-content: center;
    align-items: center;
    height: 100vh;
    font-family: 'Roboto', sans-serif;
    background-color: #040717;
    margin: 20px 0 0;
    color: #ffffff;
}

.table-container {
    width: 80%;
    overflow: auto;
    border: 1px solid #1b1f26;
    margin-top: 20px;
}

table {
    width: 100%;
    border-collapse: collapse;
}

thead th {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    background-color: #000;
    color: #00ccff;
    font-size: 15px;
    text-align: center;
}

th, td {
    border-bottom: 1px solid #1b1f26;
    padding: 10px 20px;
    font-size: 14px;
    text-align: center;
    color: #ffffff;
}

td img {
    height: 60px;
    width: 60px;
    border-radius: 50%;
    border: 5px solid #1e1e1e;
}

tbody {
    max-height: 400px; /* Set a maximum height for the tbody */
    /* overflow-y: auto; Add a vertical scrollbar when the content overflows */
}

tr:nth-child(even) {
    background-color: #0f0f0f;
}

tr:nth-child(odd) {
    background-color: #0d0d0d;
}

tr:hover td {
    color: #00ccff;
    cursor: pointer;
    background-color: #1b1f26;
}

td button {
    border: none;
    padding: 7px 20px;
    border-radius: 20px;
    background-color: #000;
    color: #00ccff;
}

/* ::-webkit-scrollbar {
    width: 6px;
}
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
} */
/* 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
} */
        </style>
        
    </head>
    
    <body>
        <div class="header_fixed">
        <table>
            <thead>
                <tr> <th>S. No.</th>
                    <th>Party Logo</th>
                    <th>Party Name</th>
                    <th>Candidate Name</th>
                    <th>Address</th>
                    <th>Age</th>
                </tr>
            </thead>
        <%
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
                    
               %>
              
            <tbody>
                <tr>
                    <td><%= rs.getInt("id")%></td>
                    <td><%= rs.getBlob(8) %></td>
                    <td><%= rs.getString(7) %></td>
                    <td><%= rs.getString(2)%></td>
                    <td><%= rs.getString(6)%></td>
                    <td><%= rs.getString(5) %></td>                
                </tr>
            </tbody>
                    <%   
                }
            }catch(Exception ex){}
        %>
        </table>
    
 </div>  
</body>
   
</html>
