// Richard Riedel, J.T. Liso, Sean Whalen
// CS 583 Fall 2017
// Programming Assignment 3

class FileLocker {
	public FileLocker(String d, String p, String pr, String v){
		directory = d;
		pubKeyFile = p;
		privKeyFile = pr;
		validateKey = v;
	}


    public byte[] genKey()
    {
        return new byte[1];
    }

    public boolean verifyKey(byte[] privKey, byte[] pubKey)
    {

        return true;
    }

    public void Nothing()
    {
    }

	private String directory;
	private String pubKeyFile;
	private String privKeyFile;
	private String validateKey;
}
