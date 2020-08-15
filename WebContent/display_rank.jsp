<%-- 
    Document   : display_rank
    Created on : May 18, 2019, 12:42:11 PM
    Author     : Aman
--%>
<%@include file="dashboard.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="register_and_login.register_setter_getter" %>
<%!
    int rank;
    register_setter_getter re=new register_setter_getter();
   
    String tlr,rpc,go,oi,pr;
    %>
    <%
        tlr=request.getParameter("tlr");
         rpc=request.getParameter("rpc");
          go=request.getParameter("go");
           oi=request.getParameter("oi");
            pr=request.getParameter("pr");
            re.settlr(Float.parseFloat(tlr));
             re.setrpc(Float.parseFloat(rpc));
              re.setgo(Float.parseFloat(go));
            re.setoi(Float.parseFloat(oi));
             re.setpr(Float.parseFloat(pr));
             double total=re.gettlr()+re.getrpc()+re.getpr()+re.getoi()+re.getgo();
             re.csv(tlr,rpc,go,oi,pr,total);
             rank=re.rank(total);
             
        %>

  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RANK</title>
        <style>
            body{
background: url(images/7.jpg) no-repeat;

background-size:cover;
}
            #block{
                               width: 50%;
                               height: 500px;
                               
                               margin-left:30%;
                               text-align: center;
                               
                      }
                      #block h1{
                          margin-top: 20%;
                          color: #ffffff;
                      }
        </style>
    </head>
    <body>
        <div id="block">
        <h1>Your Approximate Rank:<%=rank%></h1>
        </div>
    </body>
</html>
<%@page import="java.sql.*" %>