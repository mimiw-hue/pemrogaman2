/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7_interface;

/**
 *
 * @author MSI
 */
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        phone.powerOn();
    }

    void turnOffThePhone() {
        phone.powerOff();
    }

    void makePhoneLouder() {
        phone.volumeUp();
    }

    void makePhoneSilent() {
        phone.volumeDown();
    }
}
