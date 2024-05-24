
public abstract class FiguraGeometrica {
private int base;
private int altezza;
public abstract int calcolaArea(int base,int altezza);
public FiguraGeometrica(int base) {
	super();
	this.base = base;
	//this.altezza = altezza;
}
@Override
public String toString() {
	return "FiguraGeometrica [base=" + base + ", altezza=" + altezza + "]";
}
public int calcolaArea(int base) {
	// TODO Auto-generated method stub
	return 0;
}

}
