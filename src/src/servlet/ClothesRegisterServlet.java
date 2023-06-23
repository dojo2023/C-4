package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.SmallcategoryDao;
import model.Cloth;
import model.Small_category;

/**
 * Servlet implementation class ClothesRegisterServlet
 */

//↓これ絶対入れてね！！
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\images\\clothes_images") // アップロードファイルの一時的な保存先

@WebServlet("/ClothesRegisterServlet")
public class ClothesRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao sdao;
		sdao = new SmallcategoryDao();
		List<Small_category> list = sdao.selectall(null);
		request.setAttribute("smallcategory_list", list);

		List<Small_category> list2 = sdao.selectall(null);
		request.setAttribute("smallcategory_list2", list2);

		List<Small_category> list3 = sdao.selectall(null);
		request.setAttribute("smallcategory_list3", list3);

		List<Small_category> list4 = sdao.selectall(null);
		request.setAttribute("smallcategory_list4", list4);

		List<Small_category> list5 = sdao.selectall(null);
		request.setAttribute("smallcategory_list5", list5);

		List<Small_category> list6 = sdao.selectall(null);
		request.setAttribute("smallcategory_list6", list6);

		// 服登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");


		//画像一枚目、服の種類プルダウン一つ目
		Part part = request.getPart("IMAGE"); // getPartで取得

		String image = this.getFileName(part);
//		System.out.println("画像の名前＝"+image);
		request.setAttribute("image", image);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある
		part.write(image);

		//ここから上で画像の保存

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String small_category= request.getParameter("clothes_kind");
		int SMALL_CATEGORY=Integer.parseInt(small_category);
		String img = "/hello/images/clothes_images/"+image;

		//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
		Cloth clo;
		clo = new Cloth();
		clo.setSMALL_CATEGORYID(SMALL_CATEGORY);
		clo.setCLO_IMAGES(img);

		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao smallDao = new SmallcategoryDao();
		//selectIDを使ってIDで検索できるようにする
        Small_category SC=smallDao.selectID(clo.getSMALL_CATEGORYID());

        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
        clo.setSMALL_NAME(SC.getSMALL_CATEGORY());

        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
		HttpSession session = request.getSession();
		session.setAttribute("clo_img_name", clo);


		//画像二枚目、服の種類プルダウン二つ目
		Part part2 = request.getPart("IMAGE2"); // getPartで取得

		String image2 = this.getFileName(part2);
		System.out.println("画像の名前＝"+image2);
		request.setAttribute("image2", image2);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある

		//ここから上で画像の保存

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String small_category2= request.getParameter("clothes_kind2");
		int SMALL_CATEGORY2=Integer.parseInt(small_category2);

		//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
		Cloth clo2;
		clo2 = new Cloth();
		clo2.setSMALL_CATEGORYID(SMALL_CATEGORY2);

		if(!(image2.equals(""))) {
			part2.write(image2);
			String img2 = "/hello/images/clothes_images/"+image2;
			clo2.setCLO_IMAGES(img2);
		}

		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao smallDao2 = new SmallcategoryDao();
		//selectIDを使ってIDで検索できるようにする
        Small_category SC2=smallDao2.selectID(clo2.getSMALL_CATEGORYID());

        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
        clo2.setSMALL_NAME(SC2.getSMALL_CATEGORY());

        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
		HttpSession session2 = request.getSession();
		session2.setAttribute("clo_img_name2", clo2);


		//画像三枚目、服の種類プルダウン三つ目
		Part part3 = request.getPart("IMAGE3"); // getPartで取得

		String image3 = this.getFileName(part3);
		request.setAttribute("image3", image3);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある

		//ここから上で画像の保存

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String small_category3= request.getParameter("clothes_kind3");
		int SMALL_CATEGORY3=Integer.parseInt(small_category3);

		//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
		Cloth clo3;
		clo3 = new Cloth();
		clo3.setSMALL_CATEGORYID(SMALL_CATEGORY3);

		if(!(image3.equals(""))) {
			part3.write(image3);
			String img3 = "/hello/images/clothes_images/"+image3;
			clo3.setCLO_IMAGES(img3);
		}


		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao smallDao3 = new SmallcategoryDao();
		//selectIDを使ってIDで検索できるようにする
        Small_category SC3=smallDao3.selectID(clo3.getSMALL_CATEGORYID());

        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
        clo3.setSMALL_NAME(SC3.getSMALL_CATEGORY());

        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
		HttpSession session3 = request.getSession();
		session3.setAttribute("clo_img_name3", clo3);


		//画像四枚目、服の種類プルダウン四つ目
				Part part4 = request.getPart("IMAGE4"); // getPartで取得

				String image4 = this.getFileName(part4);
				request.setAttribute("image4", image4);
				// サーバの指定のファイルパスへファイルを保存
		        //場所はクラス名↑の上に指定してある

				//ここから上で画像の保存

				// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String small_category4= request.getParameter("clothes_kind4");
				int SMALL_CATEGORY4=Integer.parseInt(small_category4);

				//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
				Cloth clo4;
				clo4 = new Cloth();
				clo4.setSMALL_CATEGORYID(SMALL_CATEGORY4);

				if(!(image4.equals(""))) {
					part4.write(image4);
					String img4 = "/hello/images/clothes_images/"+image4;
					clo4.setCLO_IMAGES(img4);
				}

				//服の小カテゴリーのDaoと結び付け
				SmallcategoryDao smallDao4 = new SmallcategoryDao();
				//selectIDを使ってIDで検索できるようにする
		        Small_category SC4=smallDao4.selectID(clo4.getSMALL_CATEGORYID());

		        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
		        clo4.setSMALL_NAME(SC4.getSMALL_CATEGORY());

		        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
				HttpSession session4 = request.getSession();
				session4.setAttribute("clo_img_name4", clo4);


				//画像五枚目、服の種類プルダウン五つ目
				Part part5 = request.getPart("IMAGE5"); // getPartで取得

				String image5 = this.getFileName(part5);
				request.setAttribute("image5", image5);
				// サーバの指定のファイルパスへファイルを保存
		        //場所はクラス名↑の上に指定してある
				//ここから上で画像の保存

				// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String small_category5= request.getParameter("clothes_kind5");
				int SMALL_CATEGORY5=Integer.parseInt(small_category5);

				//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
				Cloth clo5;
				clo5 = new Cloth();
				clo5.setSMALL_CATEGORYID(SMALL_CATEGORY5);

				if(!(image5.equals(""))) {
					part5.write(image5);
					String img5 = "/hello/images/clothes_images/"+image5;
					clo5.setCLO_IMAGES(img5);
				}

				//服の小カテゴリーのDaoと結び付け
				SmallcategoryDao smallDao5 = new SmallcategoryDao();
				//selectIDを使ってIDで検索できるようにする
		        Small_category SC5=smallDao5.selectID(clo5.getSMALL_CATEGORYID());

		        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
		        clo5.setSMALL_NAME(SC5.getSMALL_CATEGORY());

		        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
				HttpSession session5 = request.getSession();
				session5.setAttribute("clo_img_name5", clo5);


				//画像六枚目、服の種類プルダウン六つ目
				Part part6 = request.getPart("IMAGE6"); // getPartで取得

				String image6 = this.getFileName(part6);
				request.setAttribute("image6", image6);
				// サーバの指定のファイルパスへファイルを保存
		        //場所はクラス名↑の上に指定してある

				//ここから上で画像の保存

				// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String small_category6= request.getParameter("clothes_kind6");
				int SMALL_CATEGORY6=Integer.parseInt(small_category6);

				//cloを定義し、上で取得したSMALL_CATEGORYをSMALL_CATEGORYID、imgをCLO_IMAGESとし、cloにセットする
				Cloth clo6;
				clo6 = new Cloth();
				clo6.setSMALL_CATEGORYID(SMALL_CATEGORY6);

				if(!(image6.equals(""))) {
					part6.write(image6);
					String img6 = "/hello/images/clothes_images/"+image6;
					clo6.setCLO_IMAGES(img6);
				}

				//服の小カテゴリーのDaoと結び付け
				SmallcategoryDao smallDao6 = new SmallcategoryDao();
				//selectIDを使ってIDで検索できるようにする
		        Small_category SC6=smallDao6.selectID(clo6.getSMALL_CATEGORYID());

		        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
		        clo6.setSMALL_NAME(SC6.getSMALL_CATEGORY());

		        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
				HttpSession session6 = request.getSession();
				session6.setAttribute("clo_img_name6", clo6);

		// 服確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register_check.jsp");
		dispatcher.forward(request, response);

	}

	//ファイルの名前を取得してくる
	private String getFileName(Part part) {
        String name = null;
        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
            if (dispotion.trim().startsWith("filename")) {
                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
                name = name.substring(name.lastIndexOf("\\") + 1);
                break;
            }
        }		// TODO 自動生成されたメソッド・スタブ
		return name;

//		// リクエストパラメータを取得する
//		request.setCharacterEncoding("UTF-8");
//		String small_categoryid = request.getParameter("clothes_kind");
//		String CLO_IMAGES = request.getParameter("clothes_img");
//		int SMALL_CATEGORYID = Integer.parseInt(small_categoryid);


	}

}
