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
     */

}
