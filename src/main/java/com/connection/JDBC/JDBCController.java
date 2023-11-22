package com.connection.JDBC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into STUDENT(name,id)values('Rock','5')");
		return "data inserted Successfully";
	}
}
