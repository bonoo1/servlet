package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseHeaderServlet" ,urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //[status-line]
        response.setStatus(HttpServletResponse.SC_OK);//http 응답코드 넣는 식

        //[response-header]
        response.setHeader("Content-type","text/plain");
        response.setHeader("Cache-Control","no-cache, no-store,must-revalidate");
        response.setHeader("Pragma","no-cahe");
        response.setHeader("my-header","hello");

        PrintWriter writer = response.getWriter();
        writer.println("ok");
    }
}
