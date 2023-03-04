package day1.Task7;

import java.util.Stack;

public class WeaponClip {
    private final Stack<String> weaponClip = new Stack<>();
    private final int maxNumberOfBulletsInClip;

    public WeaponClip(int clipCapacity) {
        this.maxNumberOfBulletsInClip = clipCapacity;

    }
    public void loadBullet(String bullet) {
        if(maxNumberOfBulletsInClip == weaponClip.size()) {
            throw new IllegalArgumentException("Clip is full");
        }
        weaponClip.push(bullet);
    }
    public boolean isLoaded() {
        return !weaponClip.empty();
    }
    public void shoot() {
        if (isLoaded()){
            System.out.println(weaponClip.pop());
        } else {
            System.out.println("Clip is empty");
        }
    }
}
