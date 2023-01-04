package conversor;

import javax.swing.JOptionPane;

public class monedas {
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor * 855.40;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	public void ConvertirPesosAEuro(double valor) {
		double monedaEuro = valor * 908.04;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
}
