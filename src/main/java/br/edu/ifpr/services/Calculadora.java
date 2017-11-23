package br.edu.ifpr.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("calculadora.jsp");
		//response.getWriter().append("Não funciono com GET blz = D ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		String resultado = "";
		if (param1.equals("") || param2.equals("")) {
			resultado = "Os valores devem ser campos numericos maiores ou iguais a 0";
			request.setAttribute("resultado", resultado);
			request.getRequestDispatcher("calculadora.jsp").forward(request, response);			
		}
		Double valor = Double.parseDouble(param1);
		Double valor2 = Double.parseDouble(param2);
		String operador = request.getParameter("operador");

		Double calculo = 0D;
		if (operador.equals("+")) {
			calculo = valor + valor2;
			resultado = calculo.toString();
		} else if (operador.equals("-")) {
			calculo = valor - valor2;
			resultado = calculo.toString();
		} else if (operador.equals("/")) {
			try {
				calculo = valor / valor2;
				resultado = calculo.toString();				
			} catch (Exception e) {
				resultado = "Erro ao dividir, verifique os valores";
			}
		} else if (operador.equals("*")) {
			calculo = valor * valor2;
			resultado = calculo.toString();
		} else {
			resultado = "Entre com um valor valido para o Operador!";
		}
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("calculadora.jsp").forward(request, response);
	}

}
