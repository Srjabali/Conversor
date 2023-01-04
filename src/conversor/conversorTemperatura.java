package conversor;

import javax.swing.JOptionPane;

public class conversorTemperatura {
	public void ConvertirCelciusAFahrenheit(double valor) {
		double temperaturaFahrenheit = valor * 32.00;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, "Los grados son: " +temperaturaFahrenheit+ "°");
	}
	public void ConvertirCelciusAKelvin(double valor) {
		double temperaturaKelvin = valor * 273.15;
		temperaturaKelvin = (double) Math.round(temperaturaKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, "Los grados son: " +temperaturaKelvin+ "°");
	}
}
