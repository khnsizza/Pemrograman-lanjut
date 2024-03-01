public class mobil {
    public class Mobil  {
       private String  noPlat;
       private String warna; 
       private String manuFaktur;
       private int kecepatan;

       public void setNoPlat (String s){
        noPlat = s;
       }

       public void setWarna (String s){
        warna = s; 
       }

       public void setmanufaktur (String s){
        manuFaktur = s;
       }
        public void setKecepatan (int i){
        kecepatan = i;
       }
       public int  getKecepatan (){
        return kecepatan;
       }
       public String getNoPlat() {
        return noPlat;
       }

       public String getWarna() {
        return warna;
       }
    
        public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manuFaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
    }

}
























    }

