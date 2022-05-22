package ss.traning.jdbc;

import ss.traning.jdbc.dao.entity.Person;
import ss.traning.jdbc.dao.impl.JDBCDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class Client {

    JDBCDaoImpl daoImpl = new JDBCDaoImpl();

    public static void main(String[] args) {
        Client personDbClient = new Client();
        personDbClient.doDatabaseActivity();
    }

    private void doDatabaseActivity() {
        Person person = new Person( 1, "James", "Bond", "007@jamesbond.com", new java.util.Date() );
        Person person2 = new Person( 2, "Forest", "Gump", "forestgump@jamesbond.com", new java.util.Date() );
        JDBCDaoImpl daoImpl = new JDBCDaoImpl();
        try
        {
            // Create
            daoImpl.insertPerson( person );
            daoImpl.insertPerson( person2 );
            System.out.println( "Persons got inserted sucessfully. This is \"C\" of CRUD " );
            System.out.println();
            System.out.println( "--------------------------------------------------------------------------------------" );

            // Read(get all)
            List<Person> persons = daoImpl.retrivePersons();
            System.out.println( "Retrived all persons from DB.This is \"R\" of CRUD " );
            for ( Person p : persons )
            {
                System.out.println( p );
            }
            System.out.println();
            System.out.println( "--------------------------------------------------------------------------------------" );
            // Update
            person.setFirstName( "Updated name" );
            daoImpl.updatePersonFirstName( person );
            System.out.println( "Updated the first name of person 2. This is \"U\" of CRUD " );
            System.out.println();
            System.out.println( "--------------------------------------------------------------------------------------" );
            // Read(get one )
            Person tempPerson2 = daoImpl.retrivePerson( 2 );
            System.out.println( "Retrived person2 from DB " + tempPerson2 );
            System.out.println();
            System.out.println( "--------------------------------------------------------------------------------------" );
            // Delete
            daoImpl.deletePerson( 2 );
            System.out.println( "Deleted person2 from DB.This is \"D\" of CRUD " );
            System.out.println();
            System.out.println( "--------------------------------------------------------------------------------------" );
            // Read(get all)

            // Delete
            //daoImpl.deleteAllRecords();
            //System.out.println( "Deleted all records" );
        }
        catch ( SQLException e )
        {
            System.out.println( "Exception occured " + e.getMessage() );
        }
        catch ( Exception e )
        {
            System.out.println( "Exception occured " + e.getMessage() );
        }
    }
}
