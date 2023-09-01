package com.tourismcorp.healthtourism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HealthTourismApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthTourismApplication.class, args);
    }

    /* TODO:
        * 1. Aynı banka hesabı birden fazla user veya şirket ile ilişkilendirilememeli.
        * 2. Uçuş konusunda seat kontrolü yapılmalı.
        * 3. Uçuş konusunda uçuşun kalkış ve varış noktaları aynı olmamalı.
        * 4. Uçuş, Randevu ve Otel için geçmiş tarih seçilmemeli.
        * 5. Otel müsaitlik kontrolü yapılmalı.
        * 6. Doktor müsaitlik kontrolü yapılmalı.
        * 7. Randevu için doktor ve hasta aynı olmamalı.
        * 8. Basit ödeme sistemi eklenebilir.
        * 9. Uygun exceptionlar eklenebilir.
        * 10. Airline company'e flight ekleme endpointi. (Aynı flight iki kere eklenmemeli.)
        * 11. Airline company'e bank account ekleme endpointi.
        * 12. Doctor'a müsait saat ve tarih ekleme endpointi.
        * 13. Hospital'a doktor ekleme endpointi. (Aynı doktor iki kere eklenmemeli ve aynı doktor birden fazla hastaneye atanmamalı.)
        * 14. Flight'a seat ekleme endpointi. (Aynı seat iki kere eklenmemeli.)
        * 15. Flight'a birden fazla seat ekleme endpointi.
        * 16. Hospital'a bank account ekleme endpointi.
        * 17. Otele oda ekleme endpointi. (Aynı oda iki kere eklenmemeli.)
        * 18. Otele birden fazla oda ekleme endpointi.
        * 19. Otele bank account ekleme endpointi.
        * 20. User'a bank account ekleme endpointi.
     */

}
