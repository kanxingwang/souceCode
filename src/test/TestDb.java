package test;

import java.sql.SQLException;
import java.util.List;

import kan.javase.jdbc.JdbcHelper;

import org.junit.Test;

public class TestDb {

	@Test
	public void test() throws SQLException {
		@SuppressWarnings("unchecked")
		List<Object> arrayList= JdbcHelper.query("select * from people");
		System.out.println(arrayList);
	}

}
