<%
    String name=(String)session.getAttribute("name");
//    if(name.equals(""))
//    {
%>
    
  
<html>
<head>
    <link rel="stylesheet" href="css/dashboard.css">
         </head>
          
<body>
         
   
    <h1 style="text-align:center;color: #ff3333">Welcome:<%=name%></h1>
    
                 <hr>
         <div id="block1">
             <a href="findrank.jsp"><input type="button" value="Find Rank" ></a><br>
                  <a href="know_value.jsp"><input type="button" value="Know Required Parameter Value"></a><br>
                  
                            <a href=login.html><input type="button" value="Logout"></a><br>
                  
             
             
             </div>
