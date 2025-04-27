package com.example.kotlinbootcampodevler.odev2

class Odev2 {
    fun soru1(derece: Double): Double {
        var fahrenhiet = (derece * 1.8 + 32)
        var sonuc = println("Sonuç : $fahrenhiet")
        return fahrenhiet
    }

    fun soru2(uzunKenar: Int, kisaKenar: Int) {
        var cevre = 2 * (uzunKenar + kisaKenar)
        println("Çevre: $cevre")

    }

    fun soru3(sayi: Int): Int {
        var sonuc = 1
        for (sayi in 1..sayi) {
            sonuc *= sayi


        }
        println("Sonuç: $sonuc")
        return sonuc


    }

    fun soru4(kenarSayi: Int): Int {
        var icAcılarToplam = (kenarSayi - 2) * 180
        println("İç Açılar Toplamı: $icAcılarToplam")
        return icAcılarToplam

    }

      fun soru5(gunSayisi: Int) {
        var gunlukSaat = 8
        var saatUcreti = 10
        var mesaiSaatUcret = 20


        return if (gunSayisi < 20  && gunSayisi > 1) {
            var sonuc1 = gunSayisi * saatUcreti * gunlukSaat
            println("Maaş : $sonuc1")
        }else{
            var sonuc2=(gunSayisi*saatUcreti*gunlukSaat)+((gunSayisi-20)*(gunlukSaat)*(mesaiSaatUcret))
            println("Maaş: $sonuc2")

        }

    }
    fun soru6(kota:Int){
        var standartKotaFiyati=100

         return if(kota<=50){
            println("Ücret :100")
        }else{
            var sonuc2=(kota-50)*4+standartKotaFiyati
             println("Ücret: $sonuc2")
        }


    }
}