package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author User
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Obteniendo los valores del formulario
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");

        // Seteando la información en código HTML
        out.print("<html> <head> <title> Resultado Servlet </title> </head>");
        out.print("<body> <h1> Parámetros procesados por el Servlet: </h1>");
        out.print("<table border='1'> ");

        out.print("<tr> <td> Usuario </td>");
        out.print("<td>" + usuario + "</td> </tr>");

        out.print("<tr> <td> Password </td>");
        out.print("<td>" + password + "</td> </tr>");

        out.print("<tr> <td> Tecnologías </td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia + " / ");
        }
        out.print("</td> </tr>");

        out.print("<tr> <td> Género </td>");
        out.print("<td>" + genero + "</td> </tr>");

        out.print("<tr> <td> Ocupación </td>");
        out.print("<td>" + ocupacion + "</td> </tr>");

        out.print("<tr> <td> Música </td>");
        out.print("<td>");
        if (musica != null) {
            for (String musicas : musica) {
                out.print(musicas + " / ");
            }
        } else {
            out.print("Música no seleccionada");
        }
        out.print("</td> </tr>");

        out.print("<tr> <td> Comentario </td>");
        out.print("<td>" + comentario + "</td> </tr>");
    }

}
