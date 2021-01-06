package model;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class VendaDeserializer implements Deserializer<Venda>{

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public Venda deserialize(String topic, byte[] data) {
		try {
			return new ObjectMapper().readValue(data, Venda.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
