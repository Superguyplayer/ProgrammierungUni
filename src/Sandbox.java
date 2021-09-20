import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sandbox {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mariadb://superguyplayer.ddns.net:3306/aktionaere?user=fern&password=2u2o37WE");

        System.out.println(connection.getMetaData().getMaxColumnsInIndex());


    }



}
