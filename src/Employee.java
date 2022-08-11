
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;
	double vergi = 0;
	double bonus = 0;
	double maas_artısı = 0;

	Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

	}

	public void tax() {

		if (salary < 1000) {
			vergi = 0;
		} else {
			vergi = (salary * 0.03);
		}
	}

	public void bonus() {

		if (workHours < 40) {
			bonus = 0;

		} else {
			bonus = (workHours - 40) * 30;
		}
	}

	public void raiseSalary() {
		if ((2021 - hireYear) < 10) {
			maas_artısı = salary * 0.05;

		} else if ((2021 - hireYear) > 10 && (2021 - hireYear) < 20) {
			maas_artısı = salary * 0.10;
		} else {
			maas_artısı = salary * 0.15;

		}

	}

	public void print() {
		double toplam_maas = (salary + bonus + maas_artısı - vergi);
		System.out.println("===============");
		System.out.println("Adı:" + name + "\nMaaşı: " + salary + "\nÇalışma saati:" + workHours + "\nVergi: " + vergi
				+ "\nBonus: " + bonus + "\nMaaş artışı: " + maas_artısı + "\nToplam maaş:" + toplam_maas);

	}
}
