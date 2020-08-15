<%-- 
    Document   : know_value
    Created on : May 18, 2019, 5:32:50 PM
    Author     : Aman
--%>
<%@include file="dashboard.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>find value</title>
        <style>
           #block{
                               width: 50%;
                               height: 500px;
                         
                               margin-left:30%;
                               text-align: center;
                               
                      }
                      #form1{
                          margin-left: 15%;
                          width: 60%;
                          height: 100px;
                       
                      }
                     .rank{
                          width: 200px;
                          height: 30px;
                      }
                      label{
                          text-align: center;
                      }
                      .submit{
                          width: 80px;
                          height: 35px;
                        margin-top: 20px;
                        background-color: #adadad;
                        
                      }
            
            
        </style>
    </head>
     <div id="block">
        <h1>Enter the rank you wish to achieve</h1>
        <div id="form1">
            <form method="post" action="value.jsp">
                <label>Rank:</label>
                <input type="text" name="rank"><br>
                <input class="submit" type="submit" value="Find Value">
                    
            </form>
            
            
        </div>
        </div>
</html>
