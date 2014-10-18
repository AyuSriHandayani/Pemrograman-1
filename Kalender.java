class Kalender{  			//penamaan kelas
	String hari;			// inisialisasi "hari"
	String tanggal;			// inisialisasi "tanggal"
	String bulan;			// inisialisasi "bulan"
	String tahun;			// inisialisasi "tahun"
	
	//Atribut
	public String gethari(){		// mendeklarasikan "hari"
		return hari;				// mengembalikan nilai "hari" 
	}
	public void sethari(String x){	// mendeklarasikan setter "hari"
		this.hari=x;				//menyatakan objek "hari"
	}
	
	public String gettanggal(){		// mendeklarasikan "tanggal"
		return tanggal;				// mengembalikan nilai "tanggal"
	}
	public void settanggal(String y){ 	// mendeklarasikan setter "tanggal"
		this.tanggal=y;					//menyatakan objek "tanggal"
	}
	
	public String getbulan(){			// mendeklarasikan "bulan"
		return bulan;					// mengembalikan nilai "bulan"
	}
	public void setbulan(String z){		// mendeklarasikan setter "bulan"
		this.bulan=z;					// menyatakan objek "bulan"
	}
	
	public String gettahun(){			// mendeklarasikan "tahun"
		return tahun;					// mengembalikan "tahun"
	}
	public void settahun(String a){		// mendeklarasikan setter "tahun"
		this.tahun=a;					// menyatakan objek "tahun"
	}
	
	
	public static void main(String [] args){			
	Kalender hariPertama = new Kalender();				// membuat nama objek baru "hariPertama"
		hariPertama.sethari("Hari Selasa");				// mengisi nilai setter hari
		System.out.print("Hari ini: ");					// mencetak "hari ini"
		System.out.println(hariPertama.gethari());		// memanggil setter "hari" dengan getter
		
		hariPertama.settanggal("14");					//mengisi setter "tanggal"
		System.out.print("Tanggal: ");					// mencetak "tanggal"
		System.out.println(hariPertama.gettanggal());	// memanggil setter "tanggal" dengan getter
		 
		hariPertama.setbulan("Oktober");				// mengisi setter "bulan"
		System.out.print("Bulan: ");					// mencetak "bulan"
		System.out.println(hariPertama.getbulan());		// memanggil setter "bulan" dengan getter
		
		hariPertama.settahun("2014");					// mengisi setter "tahun"
		System.out.print("Tahun: ");					// mencetak "tahun"
		System.out.println(hariPertama.gettahun());		// memanggil setter "tahun" dengan getter
		
	}
}