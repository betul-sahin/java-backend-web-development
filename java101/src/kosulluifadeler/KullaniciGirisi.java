package kosulluifadeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        String username = scan.nextLine();
        System.out.print("Şifreniz: ");
        String password = scan.nextLine();

        if(username.equals("backend")){
            if(password.equals("12345")){
                System.out.println("Giriş başarılı!");
            }
            else{
                System.out.println("şifre hatalı!");
                System.out.println("Şifrenizi sıfırlamak istiyor musunuz ? (e/h)");
                String yanit = scan.next();
                if(yanit.equals("e")){
                    System.out.print("Yeni şifre giriniz : ");
                    String newPassword = scan.next();
                    if(newPassword.equals("12345")){
                        System.out.println("Aynı şifreyi girdiniz. Şifre oluşturulamadı.");
                    }
                    else{
                        System.out.println("Şifre başarıyla oluşturuldu!");
                    }
                }
            }
        }
        else{
            System.out.println("kullanıcı adı hatalı!");
        }
    }
}
