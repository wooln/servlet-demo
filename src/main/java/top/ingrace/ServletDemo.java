package top.ingrace;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(request.getRequestURI());
        out.println(request.getContextPath());
        out.println(request.getRequestURL().toString());
        out.println(request.getQueryString());
        out.println(request.getHeader("referer"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}
