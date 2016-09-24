<%-- 
    Document   : LoginPage
    Created on : Jun 6, 2016, 9:31:57 AM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border: 2px solid #000099;
                margin: auto;
                
            }
        </style>
    </head>
    <body>
        <form method="GET" action="LoginServlet">
            <table>
                <caption><h2>Login Page</h2></caption>
                <tr>
                    <td> User Id</td>
                    <td>:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
               
            </table>
        </form>
    </body>
</html>
