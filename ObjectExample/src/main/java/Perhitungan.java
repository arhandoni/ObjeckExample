import javax.swing.JOptionPane;

public class Perhitungan {
	public static void main (String[] args) 
	{
		String as, bs, operator;
		int a;
		int b;
		int pilihan;
		
		as = JOptionPane.showInputDialog(null,"Masukkan Angka Pertama");
		operator = JOptionPane.showInputDialog(null,"1.Pertambahan \n2.Pengurangan \n3.Perkalian \n4.Pembagian");
		bs = JOptionPane.showInputDialog(null,"Masukkan Angka Kedua");
        
		a = Integer.parseInt(as);
		b = Integer.parseInt(bs);
		pilihan = Integer.parseInt(operator);
		
		
        switch (pilihan)
        {
            case 1: pilihan = a + b;
            
                System.out.println("Penjumlahan " +a+ " + " +b+ " = "+pilihan);
                break;
            
            case 2: pilihan = a - b;
          
                System.out.println("Pengurangan " +a+ " - " +b+ " = "+pilihan);                
                break;
            
            case 3: pilihan = a * b;
        
                System.out.println("Perkalian " +a+ " * " +b+ " = "+pilihan);
                break;
            
            case 4: pilihan = a / b;
            
                System.out.println("Pembagian " +a+ " : " +b+ " = "+pilihan);
                break;
            
            
            }
                
            double diskon = 0;
            if (pilihan >=10000) {diskon = 0.1;
            }
            else if (pilihan <20000) {diskon = 0.2;
            }
            else if (pilihan <30000) {diskon = 0.3;
            }
            else if (pilihan <40000) {diskon = 0.4;
            }
            else if (pilihan <50000) {diskon = 0.5;
            }
            else if (pilihan <60000) {diskon = 0.6;
            }
            else if (pilihan <70000) {diskon = 0.7;
            }
            else if (pilihan <80000) {diskon = 0.8;
            }
            
            int jumlah_diskon = (int) (pilihan * diskon);
            System.out.println("jumlah diskon =" + jumlah_diskon );
            
            int total_harga = pilihan - jumlah_diskon ;
            System.out.println("Total harga =" + total_harga); 
           
        }
}