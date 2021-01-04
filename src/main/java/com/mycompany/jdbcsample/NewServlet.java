/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcsample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;//*全部包含
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author eason
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter(); Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");) {
            /* TODO output your page here. You may use following sample code. */
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from LOGIN");
            String d = (String) request.getAttribute("s");
            out.println("<html>");
            out.println("<body>");
            out.println("<div style=\"text-align:center;\n"
                    + "             text-valign:center;\n"
                    + "             margin:350px;\n"
                    + "             box-sizing:border-box;\n"
                    + "             background-width:60px;\n"
                    + "             background-color:#f5f6f7;\n"
                    + "             border-top-left-radius:8px;\n"
                    + "             border-top-right-radius:8px;\n"
                    + "             border-bottom-right-radius:8px;\n"
                    + "             border-bottom-left-radius:8px;\n"
                    + "             border-top-color: initial;\n"
                    + "             border-top-style: none;\n"
                    + "             border-top-width: initial;\n"
                    + "             border-right-color: initial;\n"
                    + "             border-right-style: none;\n"
                    + "             border-right-width: 60px;\n"
                    + "             border-bottom-color: initial;\n"
                    + "             border-bottom-style: none;\n"
                    + "             border-bottom-width: initial;\n"
                    + "             border-left-color: initial;\n"
                    + "             border-left-style: none;\n"
                    + "             border-left-width: 60px;\n"
                    + "             border-image-source: initial;\n"
                    + "             border-image-slice: initial;\n"
                    + "             border-image-width: initial;\n"
                    + "             border-image-outset: initial;\n"
                    + "             border-image-repeat: initial;\n"
                    + "             padding-top: 40px;\n"
                    + "             padding-bottom: 40px;\">");
            while (rs.next()) {
                String id = rs.getString("ID");
                String password = rs.getString("PASSWORD");
                String message = rs.getString("MESSAGE");
                out.println(id + " : " + message + " " + d);
                out.println("<a href='delete_login?id=" + id + "'><button type=\"button\" class=\"btn btn-light\" style=\"margin-left:10px\">刪除</button></a><br/>");
            }
            out.println("<a href=\"message.html\"><button type=\"button\" class=\"btn btn-light\" style=\"margin-bottom:10px\">留言</button></a>");
            out.println("<a href='index.html'><button type=\"button\" class=\"btn btn-light\" style=\"margin-bottom:10px\">登出</button></a>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
