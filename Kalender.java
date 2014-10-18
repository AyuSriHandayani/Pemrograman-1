class Kalender{  		//penamaan kelas
	String hari;			// inisialisasi "hari"
	String tanggal;			// inisialisasi "tanggal"
	String bulan;			// inisialisasi "bulan"
	String tahun;			// inisialisasi "tahun"
	
	//Atribut
	public String gethari(){		// mendeklarasikan "hari"
		return hari;				// mengembalikan nilai "hari" 
	}
	public void sethari(String x){	// mendeklarasikan setter "hari"
		this.hari=x;				//xxxxxxxxxxxxx
	}
	
	public String gettanggal(){		// mendeklarasikan "tanggal"
		return tanggal;				// mengembalikan nilai "tanggal"
	}
	public void settanggal(String y){ 	// mendeklarasikan setter "tanggal"
		this.tanggal=y;					//xxxxxxxxxxxxx
	}
	
	public String getbulan(){			// mendeklarasikan "bulan"
		return bulan;					// mengembalikan nilai "bulan"
	}
	public void setbulan(String z){		// mendeklarasikan setter "bulan"
		this.bulan=z;					// xxxxxxxxxxxxx
	}
	
	public String gettahun(){			// mendeklarasikan "tahun"
		return tahun;					// mengembalikan "tahun"
	}
	public void settahun(String a){		// mendeklarasikan setter "tahun"
		this.tahun=a;					//xxxxxxxxxxxxx
	}
	
	
	public static void main(String [] args){			
	Kalender hariPertama = new Kalender();
		hariPertama.sethari("Hari Selasa");
		System.out.print("Hari ini: ");
		System.out.println(hariPertama.gethari());
		
		hariPertama.settanggal("14");
		System.out.print("Tanggal: ");
		System.out.println(hariPertama.gettanggal());
		
		hariPertama.setbulan("Oktober");
		System.out.print("Bulan: ");
		System.out.println(hariPertama.getbulan());
		
		hariPertama.settahun("2014");
		System.out.print("Tahun: ");
		System.out.println(hariPertama.gettahun());
		
	}
}