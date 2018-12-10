package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class DefaultTable {
Statement st;
Connection con;
ResultSet rs;
PreparedStatement ps;

	/**
     * userlist의 모든 레코드 조회
     * */
    public void userSelectAll(DefaultTableModel t_model) {
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from TB_USERLIST order by id");
 
            // DefaultTableModel에 있는 기존 데이터 지우기
            for (int i = 0; i < t_model.getRowCount();) {
                t_model.removeRow(0);
            }
 
            while (rs.next()) {
                Object data[] = { rs.getString(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4) };
 
                t_model.addRow(data); //DefaultTableModel에 레코드 추가
            }
 
        } catch (SQLException e) {
            System.out.println(e + "=> userSelectAll fail");
        } finally {
            dbClose();
        }
    }//userSelectAll()

    
    public void dbClose() {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (ps != null) ps.close();
        } catch (Exception e) {
            System.out.println(e + "=> dbClose fail");
        }
    }//dbClose() 

}
