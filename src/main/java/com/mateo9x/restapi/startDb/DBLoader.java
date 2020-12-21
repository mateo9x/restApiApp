package com.mateo9x.restapi.startDb;

import com.mateo9x.restapi.domain.Phone;
import com.mateo9x.restapi.repositories.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoader implements CommandLineRunner {

    PhoneRepository phoneRepository;

    public DBLoader(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Phone firstPhone = new Phone();
        firstPhone.setBrand("Apple");
        firstPhone.setModel("X");
        phoneRepository.save(firstPhone);

        Phone secondPhone = new Phone();
        secondPhone.setBrand("Samsung");
        secondPhone.setModel("11");
        phoneRepository.save(secondPhone);

        Phone thirdPhone = new Phone();
        thirdPhone.setBrand("Apple");
        thirdPhone.setModel("11");
        phoneRepository.save(thirdPhone);

        Phone fourthPhone = new Phone();
        fourthPhone.setBrand("Apple");
        fourthPhone.setModel("6S");
        phoneRepository.save(fourthPhone);

    }
}
