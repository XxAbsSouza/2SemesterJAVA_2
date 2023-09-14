//o servelet recebe os parâmetros e devolve uma página html


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjetoAgendaServelet
 */
@WebServlet("/ProjetoAgendaServelet")
public class ProjetoAgendaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjetoAgendaServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request - requisição, essa parte vai aparecer os dados enviados pelo html
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String nome = request.getParameter("nome");
				
		PrintWriter out = response.getWriter();
		// estmos obtendo algo que escreve dentro do response
		out.println("<html> <body> <h1>" + nome + "</h1></body></html>");
	}

}
