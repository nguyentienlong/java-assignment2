package mary.assignment;

import java.util.HashMap;

import javax.print.attribute.standard.MediaSize.Engineering;

public class EncryptDecrypt {
	// encrypt map
	public static HashMap<String, String> encryptedMap = new HashMap<>();

	EncryptDecrypt() {
		super();
		this.encryptedMap.put("letters", "abcdefghijklmnopqrstuvwxyz");
		this.encryptedMap.put("enc", "kngcadsxbvfhjtiumylzqropwe");
	}

	public String encrypt(String letters) {
		String enc = "";
		for (int i = 0; i < letters.length(); i++) {
			// for each character of letters, find the appropriate encode
			// character from the encryptedMap
			String temp = letters.substring(i, i + 1);
			if (encryptedMap.get("letters").indexOf(temp) > -1) {
				String encStr = encryptedMap.get("enc").substring(
						encryptedMap.get("letters").indexOf(temp),
						encryptedMap.get("letters").indexOf(temp) + 1);
				enc += encStr;
			} else if (encryptedMap.get("letters").toUpperCase().indexOf(temp) > -1) {
				String encStr = encryptedMap
						.get("enc")
						.toUpperCase()
						.substring(
								encryptedMap.get("letters").toUpperCase()
										.indexOf(temp),
								encryptedMap.get("letters").toUpperCase()
										.indexOf(temp) + 1);
				enc += encStr;
			} else {
				enc += temp;
			}
		}

		return enc;
	}

	public String decrypt(String encryptedString) {
		String dec = "";
		for (int i = 0; i < encryptedString.length(); i++) {
			// for each character of letters, find the appropriate decode
			// character from the encryptedMap
			String temp = encryptedString.substring(i, i + 1);
			if (encryptedMap.get("enc").indexOf(temp) > -1) {
				String decStr = encryptedMap.get("letters").substring(
						encryptedMap.get("enc").indexOf(temp),
						encryptedMap.get("enc").indexOf(temp) + 1);
				dec += decStr;
			} else if (encryptedMap.get("enc").toUpperCase().indexOf(temp) > -1) {
				String decStr = encryptedMap
						.get("letters")
						.toUpperCase()
						.substring(
								encryptedMap.get("enc").toUpperCase()
										.indexOf(temp),
								encryptedMap.get("enc").toUpperCase()
										.indexOf(temp) + 1);
				dec += decStr;
			} else {
				dec += temp;
			}
		}

		return dec;
	}

}
