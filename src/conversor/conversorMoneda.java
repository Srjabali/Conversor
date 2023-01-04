package conversor;

import javax.swing.*;

import conversorMonedas.ConvertirMonedas;

public class conversorMoneda {
	public static void main(String[] args) {
		
		monedas monedas = new monedas();
		conversorTemperatura temperaturas = new conversorTemperatura();
		
		String conversor = (JOptionPane.showInputDialog(null, 
				"Selecciona un conversor", "Conversor",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"Selecciona", "Conversor de monedas", "Conversor de temperatura"},
				"Selecciona")).toString();
		
		
		if(conversor == "Conversor de monedas") {
			int dinero = (Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Introduce la cantidad de dinero", "Dinero",
					JOptionPane.PLAIN_MESSAGE)));
			
			String opcionMoneda = (JOptionPane.showInputDialog(null, 
					"Selecciona moneda", "Conversor moneda",
					JOptionPane.PLAIN_MESSAGE, null, new Object[]
							{"Selecciona", "Dolar", "Euro"},
							"Selecciona")).toString();
		
			switch(opcionMoneda) {
			case "Euro":
				monedas.ConvertirPesosAEuro(dinero);
				break;
			case "Dolar":
				monedas.ConvertirPesosADolares(dinero);
				break;
			
			}
		}
		else if(conversor == "Conversor de temperatura") {
			int temperatura = (Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Introduce la cantidad de grados Celcius", "Grados C°",
					JOptionPane.PLAIN_MESSAGE)));
			
			String opcionTemperatura = (JOptionPane.showInputDialog(null, 
					"Selecciona Temperatura", "Conversor Temperatura",
					JOptionPane.PLAIN_MESSAGE, null, new Object[]
							{"Selecciona", "Fahrenheit", "Kelvin"},
							"Selecciona")).toString();
		
			switch(opcionTemperatura) {
			case "Fahrenheit":
				temperaturas.ConvertirCelciusAFahrenheit(temperatura);
				break;
			case "Kelvin":
				temperaturas.ConvertirCelciusAKelvin(temperatura);
				break;
			}	
		}
		else {
			JOptionPane.showMessageDialog(null, "Arigato, Adios");
		}
	}
}
