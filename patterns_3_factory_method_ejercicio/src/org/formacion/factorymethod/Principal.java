package org.formacion.factorymethod;

public class Principal implements Factory_Methody{

	public Lavadora frontal() {
		// TODO Esbozo de método generado automáticamente
		return new LavadoraCargaFrontal() ;
	}

	public Lavadora superior() {
		// TODO Esbozo de método generado automáticamente
		return new LavadoraCargaSuperior() ;
	}

}
