package exercise3;

public class Dihitung {
	protected int vJari;
	protected double vHasil;

	public void setJari(int Jari)
	{
	this.vJari=Jari;
	}
	
	public double getJumlah()
	{
	vHasil=vJari*vJari*3.14;
	return vHasil;
	}
}
