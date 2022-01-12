package com.nit;

import org.apache.commons.codec.binary.Base64;

public class CoDec_CodingDecoding {
	public static void main(String[] args) {
		
		
		String msg = "Hello, How are you??";
		
		byte [] byteMSG = msg.getBytes();
		byte[] encodedMSG = Base64.encodeBase64(byteMSG);
		String en_msg = new String(encodedMSG);

		System.out.println(en_msg);

		System.out.println("------Decoding----------");
		byte[] decodeMSG = en_msg.getBytes();
		byte[] decodedMSG = Base64.decodeBase64(decodeMSG);
		String decodMessage = new String(decodedMSG);
		
		System.out.println(decodMessage);
	}
}