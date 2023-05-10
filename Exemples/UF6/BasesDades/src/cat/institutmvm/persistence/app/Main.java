package cat.institutmvm.persistence.app;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pstatement = null;
        ResultSet rs = null;
        String server = "jdbc:mysql://mysql-fpinformatica.alwaysdata.net/";
        String bbdd = "fpinformatica_pg";
        String user = "206173_user";
        String password = "#123456789#";
        String sql;

        try {
            connection = DriverManager.getConnection(server + bbdd, user, password);

            sql = "INSERT INTO usuaris (usuari, pwd, edat, correu) VALUES (?,?,?,?)";

            try {
                pstatement = connection.prepareStatement(sql);
                pstatement.setString(1, "tesst");
                pstatement.setString(2, "0000");
                pstatement.setInt(3, 15);
                pstatement.setString(4, "test@test.com");
                pstatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            sql = "SELECT * FROM usuaris";

            pstatement = connection.prepareStatement(sql);
            rs = pstatement.executeQuery();

            while (rs.next()) {
                System.out.println(String.format("Nom usuari: %s", rs.getString(1)));
                System.out.println(String.format("Contrassenya: %s", rs.getString(2)));
                System.out.println(String.format("Edat: %d", rs.getInt(3)));
                System.out.println(String.format("Correu: %s", rs.getString(4)));
                System.out.println(String.format("----------------------------"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            rs.close();
            pstatement.close();
            connection.close();
        }
    }
}
