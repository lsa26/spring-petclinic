package org.springframework.samples.petclinic.owner;

public class SecretInjector {

    private static final String SECRET_TEL = "555-1234567890";
    private static final String SECRET_ADDRESS = "123 Main St";

    public static void injectSecrets(Owner owner) {
        owner.setTelephone(SECRET_TEL);
        owner.setAddress(SECRET_ADDRESS);
        
    }
}
