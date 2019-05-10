package br.com.classificados.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.classificados.dao.SecaoDao;
import br.com.classificados.entidade.Secao;

/**
 * Servlet implementation class SecaoServlet
 */
@WebServlet("/secao")
public class SecaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processar(request, response);
	}
	
	private void processar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if (acao.equalsIgnoreCase("inicio_inclusao")) {
			
			request.setAttribute("acao", "incluir");
			
			RequestDispatcher rd = 
					request.getRequestDispatcher("form_secao.jsp");
			rd.forward(request, response);
		
		}
		
		SecaoDao dao = new SecaoDao();
		Secao secao = new Secao();
		if (acao.equalsIgnoreCase("incluir")) {
			secao.setDescricao(request.getParameter("descricao"));
			
			dao.incluir(secao);
			RequestDispatcher rd = 
					request.getRequestDispatcher("lista_secao.jsp");
			rd.forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
