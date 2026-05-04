package com.vijji;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/recent")
public class RecentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");

        // Get existing cookie
        Cookie[] cookies = request.getCookies();
        String recentList = "";

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("recentlyViewed")) {
                    recentList = c.getValue();
                }
            }
        }

        // Add new product to front
        if (!recentList.isEmpty()) {
            recentList = product + "," + recentList;
        } else {
            recentList = product;
        }

        // Keep only first 3 items
        String[] items = recentList.split(",");
        String updated = "";

        for (int i = 0; i < items.length && i < 3; i++) {
            if (i == 0)
                updated = items[i];
            else
                updated += "," + items[i];
        }

        // Save cookie
        Cookie cookie = new Cookie("recentlyViewed", updated);
        cookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(cookie);

        // Display output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Recently Viewed Items</h2>");
        out.println("<p>" + updated.replace(",", " , ") + "</p>");
        out.println("<a href='index.html'>Back</a>");
    }
}