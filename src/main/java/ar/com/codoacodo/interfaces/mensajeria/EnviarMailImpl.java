package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarMailImpl implements IEnviar {
	
	private String fileSystemPath = "destino@mail.com";
	
	//cumple el contrato
	public void enviar(String msj) {
		System.out.println("Grabando en:  " + fileSystemPath);
		System.out.println("Mensaje: " + msj);

	}
}
