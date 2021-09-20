package org.formacion.factorymethod;

public class Principal implements Factory_Methody{

	public Lavadora frontal() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new LavadoraCargaFrontal() ;
	}

	public Lavadora superior() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new LavadoraCargaSuperior() ;
	}

}
