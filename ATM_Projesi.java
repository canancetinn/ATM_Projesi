package ATM_Projesi;
import java.util.Scanner;
public class ATM_Projesi {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		while(right > 0) {
			System.out.print("Kullanýcý Adýnýz:");
			userName = input.nextLine();
			System.out.print("Þifrenizi Girin:");
			password = input.nextLine();
			if(userName.equals("Patika") && password.equals("dev123")) {
				System.out.print("Merhaba, Kodluyoruz Bankasýna Hoþ geldiniz.");
				do {
					System.out.println("\"1-Para yatýrma\\n\" +\r\n"+ "\"2-Para Çekme\\n\" +\r\n"
							+ "\"3-Bakiye Sorgula\\n\" +\r\n"+ "\"4-Çýkýþ Yap\"");
					System.out.print("lütfen Yapmak Ýstediðiniz Ýþlemi Seçin:");
					select = input.nextInt();
					switch(select) {
					case 1:
						System.out.print("Yatýrýlacak Tutar:");
					    int price = input.nextInt();
					    balance += price;
					    break;
					case 2:
						System.out.print("Çekicelek Para Miktari:");
						price = input.nextInt();
						if(price > balance) {
							System.out.print("Bakiye Yetersiz");
						}else {
							balance -= price;
						}
						
						break;
					case 3:
						System.out.print("Güncel Bakiyeniz" + balance);
						break;
				    }
                } while (select != 4);
                System.out.println("Tekrar görüþmek üzere.");
                break;
				}
				  
			else {
				right--;
				System.out.print("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
				if(right == 0) {
					System.out.print("Hesabýnýz Bloke Olmuþtur. Banka ile Ýletiþime Geçin.");
				}else {
					System.out.print("Kalan hakkýnýz: " + right);
                }
            }
            
        }
}
}


