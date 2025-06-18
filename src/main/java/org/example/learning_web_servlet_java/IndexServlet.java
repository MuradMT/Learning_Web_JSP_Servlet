package org.example.learning_web_servlet_java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "indexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //essential servlet methods used here
        //forwarding-redirecting,attribute set-get,response printing,
        //request query parameter obtaining
        resp.getOutputStream().println("<h1>Hi</h1>");
        req.setAttribute("message","Hello World!");
        req.getAttribute("message");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
        resp.sendRedirect("index.jsp");
        req.getParameter("name");

        //Session management
        req.getSession().setAttribute("name","<NAME>");
        req.getSession().getAttribute("name");
        req.getSession().removeAttribute("name");//deleting
        req.getSession().invalidate();//doing logout with this ones
    }
}
//Notes
/*
    1.Servlets generally useful to apply all logic of jsp
    They acts as controllers
    Jsp should be a pure UI,no logic code here
    Servlet needs to handle it
    Before jsp we have pure servlets]but managing it hard
    so jsp built on top of servlet
    rn we can use servlet as logic management
    2.override keyword works also here
    3.mvc parts jsp-servlet
 */