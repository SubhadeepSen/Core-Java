package encodingDecoding;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/*It has three types of encoding and decoding: Simple Encoding, URL Encoding and MIME Encoding
 For every type of encoder and decoder there is a specific class for getting the corresponding object
 */

public class Base64EncodingDecoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String text = "Java 8 Encoding-Decoder";
		String url = "https://www.google.com";
		
		Encoder simpleEncoder = Base64.getEncoder();
		String encodedText = simpleEncoder.encodeToString(text.getBytes("UTF-8"));
		System.out.println("Encoded Text: " + encodedText);
		
		Decoder simpleDecoder = Base64.getDecoder();
		byte[] decodedByteArr = simpleDecoder.decode(encodedText);
		String decodedText = new String(decodedByteArr, "UTF-8");
		System.out.println("Decoded Text: " + decodedText);
		
		Encoder urlEncoder = Base64.getUrlEncoder();
		String encodedUrl = urlEncoder.encodeToString(url.getBytes("UTF-8"));
		System.out.println("Encoded URL: " + encodedUrl);
		
		Decoder urlDecoder = Base64.getDecoder();
		byte[] decodedUrlArr = urlDecoder.decode(encodedUrl);
		String decodedUrl = new String(decodedUrlArr, "UTF-8");
		System.out.println("Decoded Text: " + decodedUrl);
	}

}
