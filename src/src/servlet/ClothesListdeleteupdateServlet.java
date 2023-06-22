package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClothesDao;
import dao.SmallcategoryDao;
import model.Cloth;
import model.Small_category;

/**
 * Servlet implementation class ClothesListdeleteupdateServlet
 */
@WebServlet("/ClothesListdeleteupdateServlet")
public class ClothesListdeleteupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//String USER_ID = request.getParameter("USER_ID");
		//String SMALL_CATEGORY = request.getParameter("SMALL_CATEGORY");//画面から受け取るpostデータは全て文字列だからString
		//String CLO_IMAGES = request.getParameter("CLO_IMAGES");
		//int small_category = Integer.parseInt(SMALL_CATEGORY);//数値の変換している
		//listDaoに一つのまとまりとして入れる
		//Cloth listDao = new Cloth();
		//セッションスコープにIDを格納する
		//HttpSession session = request.getSession();
		//session.setAttribute("small_category", listDao);


		//System.out.println(request.getParameter("btn"));
		String tagName = request.getParameter("btn");
		int tagintName = Integer.parseInt(tagName);

		ClothesDao listDao = new ClothesDao();
		ArrayList<Cloth> clothesTagList = new ArrayList<Cloth>();
		clothesTagList = listDao.selectSMALL_CATEGORY(tagintName);
		//セッションの取得または作成
		HttpSession session = request.getSession();
		//データの格納
		session.setAttribute("clothesTagList", clothesTagList);


		SmallcategoryDao smallDao = new SmallcategoryDao();
		//Cloth tag = new Cloth();
		Small_category smallTag = new Small_category();
		System.out.println(tagintName);
		smallTag = smallDao.selectID(tagintName);
		System.out.println(smallTag.getSMALL_CATEGORY());
		//tag.setSMALL_TAG(smallTag.getSMALL_CATEGORY());

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("smallTag", smallTag);



		//プロフィール確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
		dispatcher.forward(request, response);
		}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String tag = request.getParameter("SMALL_CATEGORYID");
		String img = request.getParameter("CLO_IMAGES");
		//int ID = Integer.parseInt(id);
		//int TAG = Integer.parseInt(tag);

		// 更新または削除を行う
		ClothesDao cDao = new ClothesDao();

		System.out.println(request.getParameter("SUBMIT"));
		//request.getParameter("SUBMIT")
		//セッションスコープにIDを格納する
		HttpSession session = request.getSession();
		session.setAttribute("clothes_update", cDao);
		//プロフィール確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
		dispatcher.forward(request, response);









		/*if (request.getParameter("SUBMIT").equals("更新")) {
			if (cDao.update(new Cloth(ID,TAG,img))) {	// 更新成功
				request.setAttribute("result",
				new Result("更新成功！", "レコードを更新しました。", "/hello/MainServlet"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register.jsp");
				dispatcher.forward(request, response);
			}
			else {												// 更新失敗
				request.setAttribute("result",
				new Result("更新失敗！", "レコードを更新できませんでした。", "/hello/MainServlet"));
			}
		}
		else {
			if (cDao.delete(ID)) {	// 削除成功
				request.setAttribute("result",
				new Result("削除成功！", "レコードを削除しました。", "/hello/MainServlet"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/delete_check.jsp");
				dispatcher.forward(request, response);
			}
			else {						// 削除失敗
				request.setAttribute("result",
				new Result("削除失敗！", "レコードを削除できませんでした。", "/hello/MainServlet"));
			}
		}*/

		// 結果ページにフォワードする

	}

}
