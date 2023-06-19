package test;

import java.io.UnsupportedEncodingException;

import gov.keis.openapi.client.crypto.EgovARIACryptoService;
import gov.keis.openapi.client.crypto.impl.EgovARIACryptoServiceImpl;

public class CryptoTest {

	public static void main(String[] args) {
		System.out.println("*********************************************");
		System.out.println("CryptoTest Start ");
		
		// 암호화할 데이터
		String data ="암호화대상 데이터"; 
		// 인증키
		String password ="L6kYX3m9DS+dtTiJF8VtJ0HSDVGbrG2i7fd44J2ArFY=";
		
		System.out.println("data     value --> "+data);
		System.out.println("password value --> "+password);
		
		EgovARIACryptoService egovARIACryptoService = new EgovARIACryptoServiceImpl();
		
		String encryptUrlData ="";
		
		String encryptData ="";
		try {
			encryptData = egovARIACryptoService.encrypt(data, password);
			// httpclient로 전송시에는 
			encryptUrlData = egovARIACryptoService.encryptURL(data, password);
			System.out.println("encryptUrlData value --> "+encryptUrlData);
			System.out.println("encryptData    value --> "+encryptData);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String decryptData ="";
		
		decryptData = egovARIACryptoService.decrypt(encryptData, password);
		System.out.println("decryptData value --> "+decryptData);
		
		System.out.println("CryptoTest End ");
		System.out.println("*********************************************");

	}

}
