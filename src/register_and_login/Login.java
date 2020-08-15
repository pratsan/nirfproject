/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_and_login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import register_and_login.register_setter_getter;
/**
 *
 * @author Aman
 */
public class Login extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String email=request.getParameter("emailid");
        String pass=request.getParameter("pass");
        register_setter_getter re=new register_setter_getter();
        re.setemail(email);
        re.setpass(pass);
        try {
         int n=re.login();
         if(n==1)
         {
            HttpSession session=request.getSession();  
            session.setAttribute("name",re.getclg());
            
           //  request.setAttribute("name",re.getclg());
             RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
                rd.forward(request, response);
             
         }
         else{
             out.print("<html>");
                out.print("<head>");
                out.print("<script>");
                out.print("alert('invalid username or password');");
                out.print("</script>");
                out.print("</head>");
                out.print("<body>");
                out.print("</body>");
                out.print("</html>");
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                rd.include(request, response);
             
         }
        } catch (SQLException ex) {
            out.print(ex);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

}