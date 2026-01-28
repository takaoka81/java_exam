package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam3 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "SELECT m.id ,m.name,m.age,d.name FROM test_members AS m INNER JOIN test_deps AS d ON m.dep_id = d.id";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			rs = pstmt.executeQuery();

			// (5)結果の操作
           // String name = rs.getArray(test_members AS m);
			while (rs.next()) {
                System.out.print("id=" + rs.getInt( "m_id"));
                System.out.print(", name=" + rs.getString("AS m.name"));
                System.out.print(", age=" + rs.getInt("AS m.age"));
                System.out.print(", dep_name=" + rs.getString("As d.name"));
                System.out.println();
            }

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
                if(con != null){
				con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
                if(rs != null){
                    pstmt.close();
                }
			} catch (Exception ex) {
                ex.printStackTrace();
            }
		}
	}

}
