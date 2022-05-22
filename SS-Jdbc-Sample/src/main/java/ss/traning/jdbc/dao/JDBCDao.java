package ss.traning.jdbc.dao;

import ss.traning.jdbc.dao.entity.Person;

import java.sql.SQLException;
import java.util.List;

public interface JDBCDao {
     void deleteAllRecords() throws SQLException;
     void deletePerson(long id) throws SQLException;
     Person retrivePerson(long id) throws SQLException;
     void updatePersonFirstName(Person person) throws SQLException;
     void insertPerson( Person p ) throws SQLException;
     List<Person> retrivePersons() throws SQLException;

}
