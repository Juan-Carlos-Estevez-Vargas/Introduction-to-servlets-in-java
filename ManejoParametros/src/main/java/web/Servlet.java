/*
 * Primer Servlet en Java
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan Carlos Estevez Vargas
 */
// Firma del servelet (ruta de acceso)
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    // Método doPost para enviar y recibir información por el método POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Leyendo los parámetros del formulario HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        // Escribiendo la respuesta en la consola
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        // Escribiendo la respuesta mediante código HTML
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parámetro usuario es: " + usuario + "<br />");
        out.print("El parámetro password es: " + password + "<br />");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
