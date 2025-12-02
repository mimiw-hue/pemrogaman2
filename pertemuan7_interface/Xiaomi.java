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
class Xiaomi implements Phone {
    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati...");
    }

    @Override
    public void volumeUp() {
        if (!isPowerOn) return;

        if (volume < MAX_VOLUME) {
            volume++;
        }
        System.out.println("Volume Xiaomi: " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isPowerOn) return;

        if (volume > MIN_VOLUME) {
            volume--;
        }
        System.out.println("Volume Xiaomi: " + volume);
    }

    public int getVolume() {
        return volume;
    }
}

