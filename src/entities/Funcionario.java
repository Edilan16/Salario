package entities;

public class Funcionario {
		public String name;
		public double GrossSalary;
		public double Tax;
		
		public double NetSalary() {
			
			return GrossSalary - Tax;
		}
		public void  IncreaseSalary(double percentage) {
			double net = GrossSalary * (percentage /100 );
			this.GrossSalary += net ;
			
		}
		public String toString() {
			return "Employee: "
					+ name
					+ " , "
					+ String.format("%.2f", NetSalary());
		}
}
