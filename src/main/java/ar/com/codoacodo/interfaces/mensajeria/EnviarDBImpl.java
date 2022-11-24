package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarDBImpl implements IEnviar {

	private String username;
	private String password;
	private String host;
	
	@Override
	public void enviar(String msj) {
		System.out.println("conectando a mysql con username: "+ username + "y password: " + password);

		System.out.println("conectando a mysql al host"+ host);
		System.out.println("insertando en la tabla xyz el mensaje " + msj);
}

}
