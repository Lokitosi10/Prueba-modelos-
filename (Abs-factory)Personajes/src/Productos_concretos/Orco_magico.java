package Productos_concretos;

import Fabricas_abstractas.Mago;
import cliente.GUI;

public class Orco_magico implements Mago{

	@Override
	public void saludar(GUI a) {
		a.getRespuesta2().setText("� Has creado un Orco magico");
		
	}

	@Override
	public void pintarM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equipar() {
		// TODO Auto-generated method stub
		
	}



	

}
