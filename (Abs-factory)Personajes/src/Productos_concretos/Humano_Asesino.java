package Productos_concretos;

import Fabricas_abstractas.Asesino;
import cliente.GUI;

public class Humano_Asesino implements Asesino{

	@Override
	public void saludar(GUI a) {
		a.getRespuesta().setText("�Has creado un Humano asesino");
		
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equipar() {
		// TODO Auto-generated method stub
		
	}


}
