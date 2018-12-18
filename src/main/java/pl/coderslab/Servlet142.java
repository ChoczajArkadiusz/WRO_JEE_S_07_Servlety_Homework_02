package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.StringTokenizer;

@WebServlet(name = "Servlet142", urlPatterns = "/Servlet042")
public class Servlet142 extends HttpServlet {
    public static String products[] = {
            "Asus Transformr;2999.99",
            "iPhone 6';3499.18",
            "Converse Sneakers;125.00",
            "LG OLED55B6P OLED TV;6493.91",
            "Samsung HT-J4100;800.99",
            "Alpine Swiss Dress Belt;99.08",
            "60 Watt LED;1.50",
            "Arduino Nano;3.26"};


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        int productId = Integer.parseInt(id);
        if (productId >= 0 && productId < products.length) {
            StringTokenizer st = new StringTokenizer(products[productId], ";");
            response.getWriter().append(st.nextToken()).append(" - ").append(st.nextToken());
        } else {
            response.getWriter().append("Product not found.");
        }
    }


}
