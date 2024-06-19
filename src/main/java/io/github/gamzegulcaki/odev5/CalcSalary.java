package io.github.gamzegulcaki.odev5;

import java.util.Scanner;

public class CalcSalary {
  private String isim;
  private int gunlukUcret;
  private int calisilanGun;
  public CalcSalary(String isim, int gunlukUcret) {
    this.isim = isim;
    this.gunlukUcret = gunlukUcret;
    this.calisilanGun = 0;
  }
  public void gunGirisi(int gunSayisi) {
    this.calisilanGun = gunSayisi;
  }
  public int maasHesapla() {
    int maas = calisilanGun * gunlukUcret;
    int prim = 0;
    if (calisilanGun > 25) {
      int fazlaGun = calisilanGun - 25;
      prim = fazlaGun * 1000;
    }
    return maas + prim;
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Personelin ismini giriniz: ");
    String isim = scanner.nextLine();

    System.out.print("Personelin günlük ücretini giriniz: ");
    int gunlukUcret = scanner.nextInt();

    CalcSalary personel = new CalcSalary(isim, gunlukUcret);

    System.out.print("Personelin çalıştığı gün sayısını giriniz: ");
    int gunSayisi = scanner.nextInt();

    personel.gunGirisi(gunSayisi);
    int maas = personel.maasHesapla();
    System.out.println(personel.isim + "'in maaşı: " + maas + " TL");

    scanner.close();

  }


}
