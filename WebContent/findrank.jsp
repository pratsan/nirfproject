<%-- 
    Document   : findrank
    Created on : May 18, 2019, 12:14:09 PM
    Author     : Aman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dashboard.jsp" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Rank</title>
             <style>
                       body{
background: url(images/6.jpg) no-repeat;

background-size:cover;
}
                      #block{
                               width: 50%;
                               height: 500px;
                         
                               margin-left:30%;
                               text-align: center;
                               
                      }
                      #block h1{
                               text-align: center;
                      }
                      #form1{
                          margin-left: 15%;
                          width: 60%;
                          height: 100px;
                       
                      }
                       label{
                          text-align: center;
                      }
                      .cal{
                          font-size: 25px;
                      }
                      .val{
                          width: 200px;
                          height: 30px;
                      }
             </style>
    </head>
    <body>
             <div id="block">
        <h1>Enter the Following details</h1>
                      <div id="form1">
                      <form method="post" action="display_rank.jsp">
                          <label class="cal">TLR:</label>
                          <input class="val" type="text" name="tlr"><br><br>
                               
                                <label class="cal">RPC:</label>
                               <input  class="val" type="text" name="rpc"><br><br>
                                <label class="cal">GO:</label>
                               <input  class="val" type="text" name="go"><br><br>
                                <label class="cal">OI:</label>
                               <input  class="val" type="text" name="oi"><br><br>
                                <label class="cal">PR:</label>
                               <input class="val" type="text" name="pr"><br><br>
                               <input style=" width: 80px;height: 35px; margin-top: 20px;background-color: #adadad;"type="submit" value="Rank">
                               </form>
                      
                      </div>
                      </div>
    </body>
</html>
