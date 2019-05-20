package br.com.classificados.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.classificados.dao.FuncionarioDao;
import br.com.classificados.entidade.Funcionario;

/**
 * Servlet implementation class LoginInternoServlet
 */
@WebServlet("/login-interno")
public class LoginInternoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInternoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = dao.buscar(login, senha);
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("user", funcionario);
		RequestDispatcher rd = 
			request.getRequestDispatcher("inicio_restrito.jsp");
		rd.forward(request, response);		
				
				
				
				
				
				
				
		
	}

}
