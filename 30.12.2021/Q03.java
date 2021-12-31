import java.util.*;

public class Q03 {
    //        2) Bir class oluşturun, 'Q03' olarak adlandırın
    //        3) 5 elemanlı bir tamsayı listesi oluşturun
    //        4) Elemanlari doğal sıraya koyun
    //        5) Konsoldaki son 3 elemanın karelerinin toplamını bulun.
    //        6) Konsoldaki toplamı yazdırın
    //        7) 'Fonksiyonel Programlama' kullanın

    public static void main(String[] args) {

        List<Integer> tamSayi=new ArrayList<>(Arrays.asList(5,6,7,1,8,9,3,7));

        dogalSira(tamSayi);
        System.out.println();
        sonUcElKareToplami(tamSayi);
    }

    public static void dogalSira(List<Integer> tamSayi){

        tamSayi.stream().sorted().forEach(System.out::print);

    }
    public static void sonUcElKareToplami(List<Integer> tamSayi){
       Optional<Integer> result= tamSayi.stream().sorted().skip(tamSayi.size()-3).map(t -> t*t).reduce(Integer::sum);
        System.out.println(result);
    }

}
