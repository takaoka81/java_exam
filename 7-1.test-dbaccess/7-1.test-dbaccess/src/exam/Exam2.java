package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam2 {
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
			sql = "SELECT id,name,age,dep_id FROM test_members WHERE dep_id =2 ";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
            rs = pstmt.executeQuery();

			// (5)結果の操作
				while (rs.next()) {
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("name:" + rs.getString("name"));
                System.out.println("age:" + rs.getInt("age"));
                System.out.println("dep_id:" + rs.getInt("dep_id"));
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
                if(rs != null){
                    rs.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
