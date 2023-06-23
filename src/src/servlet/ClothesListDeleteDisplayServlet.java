package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClothesListDeleteDisplayServlet
 */
@WebServlet("/ClothesListDeleteDisplayServlet")
public class ClothesListDeleteDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//削除確認画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/delete_check.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*if (cDao.delete(ID)) {	// 削除成功
				request.setAttribute("result",
				new Result("削除成功！", "レコードを削除しました。", "/hello/MainServlet"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/delete_check.jsp");
				dispatcher.forward(request, response);
			}
			else {						// 削除失敗
				request.setAttribute("result",
				new Result("削除失敗！", "レコードを削除できませんでした。", "/hello/MainServlet"));
			}
		}

		*
		*
		*
		*
		*
		*	UsersDao uDao = new UsersDao();
				if (request.getParameter("ProfileChange_").equals("確定")) {
					if (uDao.update(NEWUSER)) {	// 更新成功
//						request.setAttribute("result",
//						new Result("更新成功！", "レコードを更新しました。", "/hello/MainServlet"));
//					}
//					else {												// 更新失敗
//						request.setAttribute("result",
//						new Result("更新失敗！", "レコードを更新できませんでした。", "/hello/MainServlet"));
					}
				}

//				User pu = new User(USER_ID, USER_PW,USER_GENDERID,USER_HOMEID,USER_PTEMPERTUREID);
				UsersDao puDao = new UsersDao();
				User abc = puDao.selectUSER_ID(NEWUSER.getUSER_ID());
				//セッションスコープにIDを格納する
				HttpSession session2 = request.getSession();
				session2.setAttribute("login_user", abc);
*/
	}

}
