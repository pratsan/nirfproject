<%-- 
    Document   : know_value
    Created on : May 18, 2019, 5:32:50 PM
    Author     : Aman
--%>
<%@include file="dashboard.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="register_and_login.register_setter_getter" %>
<%!
    register_setter_getter re=new register_setter_getter();
    String rank;   
    
float tlr,rpc,go,oi,pr;
%>
<%
    rank=(String)request.getParameter("rank");
 //out.print(rank);
   re.setrank(Integer.parseInt(rank));
    re.value();
   // out.print(re.gettlr());
    %>
    
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
                      .cal{
                          font-size: 30px;
                      }
            
            
        </style>
    </head>
     <div id="block">
        <h1>Enter the rank you wish to achieve</h1>
        <div id="form1">
            <form method="post" action="value.jsp">
                <label>Rank:</label>
                <input class="rank" type="text" name="rank"><br>
                <input  class="submit" type="submit" value="Find Value">
                    
            </form>
            
        </div>
        <label class="cal">Teaching, Learning & Resources:&nbsp;&nbsp;&nbsp;<%=re.gettlr()%></label><br><br>
        <label class="cal">Research and Professional Practice:&nbsp;&nbsp;&nbsp;<%=re.getrpc() %></label><br><br>
        <label class="cal">Graduation Outcomes:&nbsp;&nbsp;&nbsp;<%=re.getgo() %></label><br><br>
        <label class="cal">Outreach and Inclusivity:&nbsp;&nbsp;&nbsp;<%=re.getoi() %></label><br><br>
        <label class="cal">Perception:&nbsp;&nbsp;&nbsp;<%=re.getpr() %></label><br><br>
        </div>
</html>
