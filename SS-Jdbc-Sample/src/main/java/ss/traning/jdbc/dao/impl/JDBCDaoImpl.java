package ss.traning.jdbc.dao.impl;

import ss.traning.jdbc.dao.JDBCDao;
import ss.traning.jdbc.dao.entity.Person;
import ss.traning.jdbc.util.JDBCHelper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCDaoImpl implements JDBCDao {
    public static final String INSERT_SQL_QUERY     = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,EMAIL,JOINEDDATE) VALUES(?,?,?,?,?)";
    public static final String UPDATE_SQL_QUERY     = "UPDATE PERSON SET FIRSTNAME=? WHERE ID=?";
    public static final String SELECT_SQL_QUERY     = "SELECT ID,FIRST_NAME,LASTNAME,EMAIL,JOINEDDATE FROM PERSON WHERE ID=?";
    public static final String SELECT_ALL_SQL_QUERY = "SELECT ID,FIRSTNAME,LASTNAME,EMAIL,JOINEDDATE FROM PERSON";
    public static final String DELETE_SQL_QUERY     = "DELETE FROM PERSON WHERE ID=?";
    public static final String DELETE_ALL_SQL_QUERY = "DELETE FROM PERSON";

    @Override
    public void deleteAllRecords() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try
        {
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println( "Error getting the connection. Please check if the DB server is running" );
                return;
            }
            ps = con.prepareStatement( DELETE_ALL_SQL_QUERY );
            ps.execute();
            System.out.println( "deleteAllRecords => " + ps.toString() );
        }
        catch ( SQLException e )
        {
            throw e;

        }

        finally
        {
            try
            {
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
    }

    @Override
    public void deletePerson(long id) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try
        {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement( DELETE_SQL_QUERY );
            ps.setLong( 1, id );
            ps.execute();
            System.out.println( "deletePerson => " + ps.toString() );
        }
        catch ( SQLException e )
        {
            throw e;
        }

        finally
        {
            try
            {
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
    }

    @Override
    public Person retrivePerson(long id) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Person person = new Person();
        try
        {
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println( "Error getting the connection. Please check if the DB server is running" );
                return person;
            }
            ps = con.prepareStatement( SELECT_SQL_QUERY );
            ps.setLong( 1, id );
            rs = ps.executeQuery();
            System.out.println( "retrivePerson => " + ps.toString() );
            while ( rs.next() )
            {
                person.setId( rs.getLong( "ID" ) );
                person.setFirstName( rs.getString( "FIRSTNAME" ) );
                person.setLastName( rs.getString( "LASTNAME" ) );
                person.setEmail( rs.getString( 4 ) ); // this is to show that we can retrive using index of the column
                person.setJoinedDate( rs.getDate( "JOINEDDATE" ) );
            }

        }
        catch ( SQLException e )
        {
            throw e;

        }

        finally
        {
            try
            {
                JDBCHelper.closeResultSet( rs );
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
        return person;
    }

    @Override
    public void updatePersonFirstName(Person person) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try
        {
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println( "Error getting the connection. Please check if the DB server is running" );
                return;
            }
            con.setAutoCommit( false );
            ps = con.prepareStatement( UPDATE_SQL_QUERY );
            ps.setString( 1, person.getFirstName() );
            ps.setLong( 2, person.getId() );
            ps.execute();
            System.out.println( "updatePersonFirstName => " + ps.toString() );
            con.commit();

        }
        catch ( SQLException e )
        {
            try
            {
                if ( con != null )
                {
                    con.rollback();
                    throw e;
                }
            }
            catch ( SQLException e1 )
            {
                throw e1;
            }
        }
        finally
        {
            try
            {
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
    }

    @Override
    public void insertPerson(Person p) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try
        {
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println( "Error getting the connection. Please check if the DB server is running" );
                return;
            }
            con.setAutoCommit( false );
            ps = con.prepareStatement( INSERT_SQL_QUERY );
            ps.setLong( 1, p.getId() );
            ps.setString( 2, p.getFirstName() );
            ps.setString( 3, p.getLastName() );
            ps.setString( 4, p.getEmail() );
            ps.setDate( 5, new Date( p.getJoinedDate().getTime() ) );

            ps.execute();
            System.out.println( "insertPerson => " + ps.toString() );
            con.commit();

        }
        catch ( SQLException e )
        {
            try
            {
                if ( con != null )
                {
                    con.rollback();
                }
            }
            catch ( SQLException e1 )
            {
                throw e1;
            }
            throw e;
        }
        finally
        {
            try
            {
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
    }

    @Override
    public List<Person> retrivePersons() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Person> persons = new ArrayList<>();
        try
        {
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println( "Error getting the connection. Please check if the DB server is running" );
                return persons;
            }
            ps = con.prepareStatement( SELECT_ALL_SQL_QUERY );
            rs = ps.executeQuery();
            System.out.println( "retrivePersons => " + ps.toString() );
            while ( rs.next() )
            {
                Person p = new Person();
                p.setId( rs.getLong( "ID" ) );
                p.setFirstName( rs.getString( "FIRSTNAME" ) );
                p.setLastName( rs.getString( "LASTNAME" ) );
                p.setEmail( rs.getString( 4 ) ); // this is to show that we can retrive using index of the column
                p.setJoinedDate( rs.getDate( "JOINEDDATE" ) );
                persons.add( p );

            }

        }
        catch ( SQLException e )
        {
            throw e;

        }

        finally
        {
            try
            {
                JDBCHelper.closeResultSet( rs );
                JDBCHelper.closePrepaerdStatement( ps );
                JDBCHelper.closeConnection( con );
            }
            catch ( SQLException e )
            {
                throw e;
            }
        }
        return persons;
    }


}
