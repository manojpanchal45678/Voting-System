<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html> 
<html lang="en"> 
<head> 
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <title>Voting Ballot</title> 
    <style> 
        body { 
            background-color: #1f2937; /* Dark background color */ 
            color: #fff; 
            font-family: Arial, sans-serif; 
            text-align: center; 
            align-content: center; 
        } 
        table { 
            width: 80%; 
            margin: 20px; 
            border-collapse: collapse; 
 
        } 
        th, td { 
            border: 2px solid #1f2937; 
            padding: 10px; 
        } 
        th { 
            background-color: #334155; 
            color: #fff; 
        } 
        td { 
            background-color: #28a745; /* Green color for selected candidates */ 
        } 
        .vote-button { 
            background-color: #28a745; /* Green color for vote buttons */ 
            color: #fff; 
            border: none; 
            padding: 10px 20px; 
            font-size: 16px; 
            border-radius: 5px; 
            cursor: pointer; 
            display: none; /* Initially hidden */ 
        } 
        .selected .vote-button { 
            display: block; /* Display when the candidate is selected */ 
        } 
        .vote-button:hover { 
            background-color: #1f2937; /* Darker color on hover */ 
        } 
        .radio-button { 
            display: none; 
        } 
        .radio-label { 
            display: block; 
            width: 100%; 
            padding: 10px; 
            cursor: pointer; 
            text-align: center; 
        } 
        .radio-label input[type="radio"]:checked + .vote-button { 
            display: block; 
        } 
    </style> 
</head> 
<body> 
    <h1>Voting Ballot</h1> 
    <table> 
        <thead> 
            <tr> 
                <th>Serial Number</th> 
                <th>Candidate Logo</th> 
                <th>Candidate Name</th> 
                <th>Submit Vote</th> 
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
            <!-- Candidate 1 --> 
            <tr> 
                <td><%= rs.getInt("id")%></td> 
                <td><%= rs.getBlob(8)%></td> 
                <td><%=rs.getString(2)%></td> 
                <td> 
                    <label class="radio-label"> 
                        <input type="radio" name="candidate" class="radio-button"> 
                        <div class="vote-button">Submit Vote</div> 
                        <div>Click here to vote</div> 
                    </label> 
                </td>                   
            </tr>
        </tbody> 
         <%   
                }
            }catch(Exception ex){}
        %>
    </table> 
 
    <script> 
        const radioButtons = document.querySelectorAll('.radio-button'); 
         
        radioButtons.forEach((radio) => { 
            radio.addEventListener('change', (event) => { 
                if (event.target.checked) { 
                    // Unselect all other rows 
                    radioButtons.forEach((rb) => { 
                        rb.closest('tr').classList.remove('selected'); 
                    }); 
                     
                    // Select the row 
                    event.target.closest('tr').classList.add('selected'); 
                } 
            }); 
        }); 
    </script> 
</body> 
</html>