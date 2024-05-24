package it.csv.db.service;



import it.csv.db.service.CSVReaderService;

import java.util.List;

public class Record {
    private String attributo1;
    private String attributo2;
    private int attributo3;

    public Record(String attributo1, String attributo2, int attributo3) {
        this.attributo1 = attributo1;
        this.attributo2 = attributo2;
        this.attributo3 = attributo3;
    }

    public String getAttributo1() {
        return attributo1;
    }

    public String getAttributo2() {
        return attributo2;
    }

    public int getAttributo3() {
        return attributo3;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "attributo1='" + attributo1 + '\'' +
                ", attributo2='" + attributo2 + '\'' +
                ", attributo3=" + attributo3 +
                '}';
    }
}

