package com.codecool.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Example URL:
// http://localhost:8080/?first_name=John&last_name=Smith

@WebServlet(name = "simpleServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class ServletWithAnnotations extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        String title = "GET method with parameters to display";

        out.println(
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "<li><b>First Name</b>: " + request.getParameter("first_name") + "\n" +
                "<li><b>Last Name</b>: " + request.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "<div> You can visit another servlet: <a href=\"/another\">Visit the other servlet</a></div>" +
                "</body></html>"
        );
    }
}
