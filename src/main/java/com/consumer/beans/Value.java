package com.consumer.beans;

public class Value {

	private Long id;
	private String quote;
	
	public Value() {
		super();
	}

	public Value(Long id, String quote) {
		super();
		this.id = id;
		this.quote = quote;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	 @Override
	    public String toString() {
	        return "Value{" +
	                "id=" + id +
	                ", quote='" + quote + '\'' +
	                '}';
	    }
	 
}
