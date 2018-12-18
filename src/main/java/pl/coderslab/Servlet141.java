package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@WebServlet(name = "Servlet141", urlPatterns = "/Servlet041")
public class Servlet141 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        for (int i = 0; i <= 7; i++) {
            String link = "<a href=/Servlet042?id=" + i + ">";
            String name = " Link do produktu " + i + " ";
            String end = "</a><br>";
            response.getWriter().append(link).append(name).append(end);
        }
    }


}
