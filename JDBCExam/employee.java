package com.labexam;

import java.sql.ResultSet;
import java.sql.SQLException;

public class employee {

		private int eno;
		private String ename;
		private String department;
		
		
		
		public employee(ResultSet rs) throws SQLException {
			
			this.eno = rs.getInt(1);
			this.ename = rs.getString(2);
			this.department = rs.getString(3);
		}
		
	
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public employee() {
			super();
		}


		@Override
		public String toString() {
			return "employee [eno=" + eno + ", ename=" + ename + ", department=" + department + "]";
		}
		
		
		
		
}
