package com.example.package_delivery;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        if (path.equals("/index.jsp")) {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().println("<h1>" + message + "</h1>");
        } else {
            response.sendError(404);
        }
        response.setContentType("text/html");
        //

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}