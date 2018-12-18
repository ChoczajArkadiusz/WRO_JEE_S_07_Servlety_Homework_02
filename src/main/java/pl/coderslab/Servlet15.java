package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

@WebServlet(name = "Servlet15", urlPatterns = "/Servlet15")
public class Servlet15 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }
        response.getWriter().append("\nWylosowanie liczby\n");
        response.getWriter().append(numbers.toString()).append("\n");
        Collections.sort(numbers);
        response.getWriter().append("\nPosortowane liczby\n");
        response.getWriter().append(numbers.toString());
    }


}
