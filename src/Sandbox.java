import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sandbox {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mariadb://superguyplayer.ddns.net:3306/world?user=root&password=Antonia1,");




    }



}
