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
			System.out.print("Kullan�c� Ad�n�z:");
			userName = input.nextLine();
			System.out.print("�ifrenizi Girin:");
			password = input.nextLine();
			if(userName.equals("Patika") && password.equals("dev123")) {
				System.out.print("Merhaba, Kodluyoruz Bankas�na Ho� geldiniz.");
				do {
					System.out.println("\"1-Para yat�rma\\n\" +\r\n"+ "\"2-Para �ekme\\n\" +\r\n"
							+ "\"3-Bakiye Sorgula\\n\" +\r\n"+ "\"4-��k�� Yap\"");
					System.out.print("l�tfen Yapmak �stedi�iniz ��lemi Se�in:");
					select = input.nextInt();
					switch(select) {
					case 1:
						System.out.print("Yat�r�lacak Tutar:");
					    int price = input.nextInt();
					    balance += price;
					    break;
					case 2:
						System.out.print("�ekicelek Para Miktari:");
						price = input.nextInt();
						if(price > balance) {
							System.out.print("Bakiye Yetersiz");
						}else {
							balance -= price;
						}
						
						break;
					case 3:
						System.out.print("G�ncel Bakiyeniz" + balance);
						break;
				    }
                } while (select != 4);
                System.out.println("Tekrar g�r��mek �zere.");
                break;
				}
				  
			else {
				right--;
				System.out.print("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
				if(right == 0) {
					System.out.print("Hesab�n�z Bloke Olmu�tur. Banka ile �leti�ime Ge�in.");
				}else {
					System.out.print("Kalan hakk�n�z: " + right);
                }
            }
            
        }
}
}


