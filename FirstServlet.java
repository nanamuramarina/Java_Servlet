// 4つのパッケージをインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// マッピングを指定
@WebServlet("/first")
// HttpServletクラスを継承
public class FirstServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
  // doGet()をオーバーライド
    throws IOException, ServletException {
      // コンテンツタイプを指定
    res.setContentType("text/html;charset=utf-8");
    // PrintWriterを取得
    PtintWriter out = res.getWriter();
    // PrintWriterで出力
    out.println("<html>");
    out.println("<head>");
    out.println("<title>はじめてのサーブレット</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>サーブレットを始めよう！</h1>");
    out.println("</body>");
    out.println("</html>");
    }
}