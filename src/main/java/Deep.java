public class Deep {

    public static void main(String[] args) {
        
        
        String Ab = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String Texto = "Si Cupdmzaplil Uikpwuis Icbwuwti lm Tmfpkw oi lmamtxmvilw cu xixms xzwbiñwupkw mu si opabwzpi g mu si nwztikpwu lm ucmabzw xipa. Sia bizmia acabiubpdia lm mabi puabpbckpwu xcjspki, icbwuwti g sipki awu si lwkmukpi, si pudmabpñikpwu g si lpncapwu lm si kcsbczi.\r\n"
				+ "Mu ms tculw ikilmtpkw ma zmkwuwkpli kwtw cui cupdmzaplil lm mfkmsmukpi. Si CUIT zmaxwulm is xzmamubm g tpzi ms ncbczw kwtw ms xzwgmkbw kcsbczis tia ptxwzbiubm lm Tmfpkw.\r\n"
				+ "Si CUIT ma cu maxikpw lm spjmzbilma. Mu mssi am xzikbpki kwbplpiuitmubm ms zmaxmbw, si bwsmziukpi g ms lpiswñw. Si xsczisplil lm plmia g lm xmuaitpmubw ma ixzmkpili kwtw apñuw lm ac zpycmhi g ucuki kwtw nikbwz lm lmjpsplil.";
		String Descifrado = "";
		
		Texto = Texto.toUpperCase();
		char letra;	
		for (int Key = 1 ; Key <= 27; Key++) {
		for (int i = 0; i < Texto.length(); i++) {
			letra = Texto.charAt(i);
			int lug = Ab.indexOf(letra);
		
		if(lug == -1) {
			Descifrado += letra;
		}else {
			if((lug + Key) >= 27) {
				Descifrado += Ab.charAt((lug + Key) - 27);
			}else {
				Descifrado += Ab.charAt(lug + Key);
			}	
		}
		}
		System.out.println("Descifrado recorrido " + Key + " Veces da como resultado: " + Descifrado);
		System.out.println("\r\n");
		Descifrado = "";
		}
    }
    
}
