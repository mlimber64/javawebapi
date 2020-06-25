package com.java.api.bean;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon 
{
	private String idPokemon;
	private String name;
	private String imagen;
	private String url;
	
	

	public String getIdPokemon() {
		return idPokemon;
	}

	public void setIdPokemon(String idPokemon) {
		this.idPokemon = idPokemon;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Pokemon [idPokemon=" + idPokemon + ", name=" + name + ", imagen=" + imagen + ", url=" + url + "]";
	}

	

	
	
	//public String toJson()
	//{//
		//return toJson();
	//}
	
}
