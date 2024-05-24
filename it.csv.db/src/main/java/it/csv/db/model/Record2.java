package it.csv.db.model;

public class Record2 {
    private String attributo1;
    private String attributo2;
    private String attributo3;
    private String attributo4;
    private String attributo5;
    private String attributo6;
	public Record2(String attributo1, String attributo2, String attributo3, String attributo4, String attributo5,
			String attributo6) {
		super();
		this.attributo1 = attributo1;
		this.attributo2 = attributo2;
		this.attributo3 = attributo3;
		this.attributo4 = attributo4;
		this.attributo5 = attributo5;
		this.attributo6 = attributo6;
	}
	public String getAttributo1() {
		return attributo1;
	}
	public void setAttributo1(String attributo1) {
		this.attributo1 = attributo1;
	}
	public String getAttributo2() {
		return attributo2;
	}
	public void setAttributo2(String attributo2) {
		this.attributo2 = attributo2;
	}
	public String getAttributo3() {
		return attributo3;
	}
	public void setAttributo3(String attributo3) {
		this.attributo3 = attributo3;
	}
	public String getAttributo4() {
		return attributo4;
	}
	public void setAttributo4(String attributo4) {
		this.attributo4 = attributo4;
	}
	public String getAttributo5() {
		return attributo5;
	}
	public void setAttributo5(String attributo5) {
		this.attributo5 = attributo5;
	}
	public String getAttributo6() {
		return attributo6;
	}
	public void setAttributo6(String attributo6) {
		this.attributo6 = attributo6;
	}

	@Override
	public String toString() {
		return "Record2 [attributo1=" + attributo1 + ", attributo2=" + attributo2 + ", attributo3=" + attributo3
				+ ", attributo4=" + attributo4 + ", attributo5=" + attributo5 + ", attributo6=" + attributo6 + "]";
	}

   
   

}
