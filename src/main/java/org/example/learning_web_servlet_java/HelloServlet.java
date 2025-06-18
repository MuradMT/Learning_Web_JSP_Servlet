package org.example.learning_web_servlet_java;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
    //Notes
    //region JSP,Servlet Lesson 1
    /*
        1.Maven/Gradle is built/dependency tools ,acts as c# nuget
        2.JSP is java server pages,acts as c# razor
        3.Servlet acts as c# controller
        4.Maven installs project to m2 in our laptop
        5.pom xml file tells us what is dependencies etc
        6.war is almost same as jar,but it is web archive
        7.Pom file adds groupid artifact id version etc
        We can add any console app here in the dependency
        8.When we deploy with maven it goes to
        nexus repository,it acts as maven repository
        9.Tomcat is c# iis or kestrel
     */
    //endregion
    //region JSP,Servlet Lesson 2
    /*
         1.Difference between explode and war file
         2.Index.jsp is main entry point
         3.Redeploy vs restart server
         4.Gradle works with groovy,maven with xml,
         in maven we can not modify lifecycle
         5.HTML,CSS,JS,Bootstrap in java
         6.Learned about scriplet <% %> and
         expression tags <%= %> in jsp
         7.<%@ page %> directive in JSP
         8.out.println() is sout alternative in java web
         comes from jspwriter
         9.IN JSP html rendered in server
         10.JSP is template engine such as razor
         MVC alternative is thymeleaf
     */
    //endregion
}