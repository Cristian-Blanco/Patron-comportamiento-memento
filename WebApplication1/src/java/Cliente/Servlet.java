/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Caretaker.BaseDeDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
                BaseDeDatos bd = new BaseDeDatos();
		bd.agregarRegistro("Cristian Martinez",33,"asdasd@gmail.com");
		bd.agregarRegistro("Javier Blanco",32,"dfgggg@gmail.com");
		bd.agregarRegistro("Jackson Bonilla",18,"qwewewwe@gmail.com");
		bd.agregarRegistro("Diego Maradona",10,"willywonka@gmail.com");
		bd.generarBackup();
        /*Se utiliza mas este patron en una base de datos, la informacion depende si se guarda o no*/        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">\n" +
                    "        <title>BaseDeDatos</title>\n" +
                    "        <link rel=\"icon\"  type=\"image/png\" href=\"https://img.freepik.com/vector-gratis/vector-zoologico-animal_74440-1792.jpg?size=626&ext=jpg\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
                    "    <link rel=\"stylesheet\" href=\"css/plan_style.css\">\n" +
                    "    <link rel=\"stylesheet\" href=\"css/form_style.css\">");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=\"main-container\">\n" +
                    "\n" +
                    "		<table>\n" +
                    "			<thead>\n" +
                    "				<tr>\n" +
                    "					<th>Nombre</th><th>Edad</th><th>Correo</th>\n" +
                    "				</tr>\n" +
                    "			</thead>\n" +
                    "\n");
            out.println(bd.mostrarListado());
                   out.println( "            <tr>\n" +
                    "                <form action=\"\" method=\"GET\">\n" +
                    "				<td></td><td><a class=\"btn btn-primary btn-lg\" href=\"Servlet\">Base de datos exitosa</a></td><td></td>\n" +
                    "                </form>\n" +
                    "            </tr>\n" +
                    "        </table>\n" +
                    "\n" +
                    "    </div>");
            out.println("</body>");
            out.println("</html>");
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
