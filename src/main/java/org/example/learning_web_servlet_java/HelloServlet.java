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
}