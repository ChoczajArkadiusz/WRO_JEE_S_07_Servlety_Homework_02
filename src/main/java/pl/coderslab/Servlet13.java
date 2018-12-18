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

@WebServlet(name = "Servlet13", urlPatterns = "/Servlet13")
public class Servlet13 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("Lista języków programowania, które wzorują się na paradygmacie obiektowym: \n\n");

        try {
            String pathString = getServletContext().getRealPath("oop.txt");
            Path path = Paths.get(pathString);
            Scanner scan = new Scanner(path);
            StringBuilder sb = new StringBuilder();
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine()).append("\n");
            }
            response.getWriter().append(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
