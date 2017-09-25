package servlet;

import logic.CheckBatman;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AreaCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getAttribute("error") == null) {
            doResponse(response, request);
        } else {
            forbidden(response);
        }
    }

    private void doResponse(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        CheckBatman checkBatman = new CheckBatman(Integer.parseInt(request.getParameter("x")),
                Integer.parseInt(request.getParameter("y")),
                Integer.parseInt(request.getParameter("zoom")));

        checkBatman.updateRequest(request);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    private void forbidden(HttpServletResponse response) throws IOException {
        response.sendError(response.SC_FORBIDDEN);
    }
}
