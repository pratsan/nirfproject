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

/**
 *
 * @author Aman
 */
public class Register extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PrintWriter pw=response.getWriter();
      String clg=request.getParameter("name");
     String email=request.getParameter("email");
     String pass=request.getParameter("password");
     register_setter_getter re=new register_setter_getter();
     re.setclg(clg);
     re.setemail(email);
     re.setpass(pass);
        try {
            int n=re.register();
            if(n>0)
            {
                pw.print("<html>");
                pw.print("<head>");
                pw.print("<script>");
                pw.print("alert('registered successfully');");
                pw.print("</script>");
                pw.print("</head>");
                pw.print("<body>");
                pw.print("</body>");
                pw.print("</html>");
                RequestDispatcher rd=request.getRequestDispatcher("registration.html");
                rd.include(request, response);
                
            }
            else
            {
                pw.print("already registered");
            }
        } catch (SQLException ex) {
            pw.print(ex);
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
