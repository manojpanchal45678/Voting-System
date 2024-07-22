<%-- 
    Document   : Home
    Created on : 8 Nov, 2023, 4:56:51 PM
    Author     : manoj
--%>

<%@page import="projectclasses.Loading"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HOME PAGE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         
        <link rel="stylesheet" type="text/css" href="style.css"/> 
        <link rel="stylesheet" href="../projectcss/home.css" type="text/css"/> 
        <link rel="stylesheet" href="../projectcss/home.css" type="text/css"/> 
 
    </head> 
    <body> 
        <div class="header"> 
            <div class="navigation"> 
                <img class="logo" src="logo.png"> 
                <ul>
                    <li><a href="home.html">Home</a></li> 
                    <li><a href="voterregistration.html">Registration</a></li> 
                    <li><a href="voterlogin.html">Voting</a></li> 
                    <li><a href="ResultData.jsp">Result</a></li> 
                    <li><a href="adminhome.html">Admin</a></li> 
                </ul> 
            </div> 
            <div class="window"> 
                <div class="slogan"> 
                    <h1>Vote it's</h1> 
                    <h1>your right</h1> 
                </div> 
                <div class="image"> 
                    <img src="bg6.png" width="450px" height="300px"> 
                </div> 
            </div> 
        </div> 
 <%
          Loading l = new Loading();
          l.Load();
          Thread t = new Thread(l);
          t.start();
        %>
    </body> 
</html>
    