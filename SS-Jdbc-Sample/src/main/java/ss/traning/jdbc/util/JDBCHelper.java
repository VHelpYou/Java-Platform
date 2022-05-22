package ss.traning.jdbc.util;

import java.sql.*;

public class JDBCHelper {
    private static Connection connection;

    static
    {
        try
        {
            Class.forName( JDBCConstants.DRIVER_NAME );
        }
        catch ( ClassNotFoundException e )
        {
            System.out.println( "Driver class not found" );
        }
    }

    public static Connection getConnection() throws SQLException
    {
        connection = DriverManager.getConnection( JDBCConstants.URL, JDBCConstants.USERNAME, JDBCConstants.PASSWORD );
        return connection;
    }

    public static void closeConnection( Connection con ) throws SQLException
    {
        if ( con != null )
        {
            con.close();
        }
    }

    public static void closePrepaerdStatement( PreparedStatement stmt ) throws SQLException
    {
        if ( stmt != null )
        {
            stmt.close();
        }
    }

    public static void closeResultSet( ResultSet rs ) throws SQLException
    {
        if ( rs != null )
        {
            rs.close();
        }
    }

}
