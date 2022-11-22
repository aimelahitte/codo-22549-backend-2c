package ar.com.codoacodo.interfaces;

public class Persona {

	private String nombre;
	private String idioma; //nace
	private String[] otrosIdiomas; //aprende
	
	public Persona(String nombre, String idioma) {
		setNombre(nombre);
		setIdioma(idioma);
		setOtrosIdiomas(new String[0]);
	}

	private void setOtrosIdiomas(String[] idiomas) {
		this.otrosIdiomas = idiomas;
	}
	
	public void decir(String palabra) {
		System.out.println(getNombre() + " dice " + palabra + " en " + getIdioma());
	}
	
	//sobrecarga de metodo: una forma de polimorfismo
	public void decir(String algo, String idioma) {
			
		//
		//
		//
		
		
		//en JAVA no se usa == para comparar, usamos .equals()
		if (getIdioma().equals(idioma) || existe(idioma)) {
			System.out.println(getNombre() + " puede decir " + algo + " en " + idioma);
		}else {
			System.out.println(getNombre() + " NO puede hablar " + idioma);
			}
	}
	
	private boolean existe(String idioma) {
		boolean existe = false;
		for (int i=0; !existe && i < getOtrosIdiomas().length; i++) {
			existe = getOtrosIdiomas()[i] == idioma; //true/false
			}
		return existe;

		}
	
	public void aprender(String nuevoIdioma) {
		//si el idioma nativo no es chino
		//&& no esta en this.otrosIdiomas
		
		//agrego a la lista this.otrosIdiomas
		if(getIdioma().equals(nuevoIdioma) && !existe(nuevoIdioma)) {
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length + 1];
			for(int i=0;i>this.otrosIdiomas.length;i++) { //f6
				nuevosIdiomas[i] = this.otrosIdiomas[i];
			}
			nuevosIdiomas[this.otrosIdiomas.length] = nuevoIdioma;
			setOtrosIdiomas(nuevosIdiomas);
		}
	}
	
	private void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	//alt+shift+s
	
}
	