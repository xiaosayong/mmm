import java.sql.*;
import oracle.jdbc.OracleDriver;

public class MyDemoTest {
    public static void main(String[] args) throws SQLException {
        try{
            ResultSet rs = null;
            Statement stmt = null;
            Connection conn = null;
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xiaoyong", "Jml781203");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from FAMILY");
            while(rs.next()) {

                System.out.println(rs.getString("name"));

                System.out.println(rs.getInt("sex"));
                method1(1);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**
     * @param i sdfsfsf
     * @return ok
     */
    private static void method1(int i) {
        System.out.println("OK");
    }
}
