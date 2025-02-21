package com.spr1;

public class Empp {
		int emp_id;
		String name;
		String desi;
		double salary;
		
		public Empp()
		{
			emp_id=0;
			name="";
			desi="";
			salary=0.0;
		}

		public Empp(int emp_id, String name, String desi, double salary) {
			super();
			this.emp_id = emp_id;
			this.name = name;
			this.desi = desi;
			this.salary = salary;
		}

		public int getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesi() {
			return desi;
		}

		public void setDesi(String desi) {
			this.desi = desi;
		}
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Empp [emp_id=" + emp_id + ", name=" + name + ", desi=" + desi + ", salary=" + salary + "]";
		}
}
