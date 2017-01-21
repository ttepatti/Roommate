package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.UserDB;
import Objects.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDB userDatabase = new UserDB();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("loginView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signUp = request.getParameter("signUp");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		if(signUp != null){
			response.sendRedirect("SignUp");
		}
		if(login != null){
			response.sendRedirect("Login");
		}
		if(password != null && username != null){
			List<User> userList = userDatabase.retrieveAllUsers();
			for(int i = 0; i < userList.size(); i++){
				User currentUser = userList.get(i);
				if(currentUser.getUsername().equals(username) && currentUser.getPassword().equals(password)){
					response.sendRedirect("Account");
				}
			}
			
		}
	}

}
