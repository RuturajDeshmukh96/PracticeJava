package oops;

public class Gun {
    private String gunName;

    private int ammo;

    public Gun (String gunName){
        this. gunName=gunName;
        this. ammo = 30  ;
        System.out.println("Gun Equipped: " + gunName);
    }
    public String getGunName() {
        return getGunName();
    }
    public int getAmmo(){
        return getAmmo();
    }
    public  void shoot (int bulletfired ){
        ammo = ammo - bulletfired;
        if (ammo <= 0 ){
            System.out.println("Out of Ammo! Reload needed! ");
        }else {
            System.out.println("Bullets left: " + ammo);
        }
    }
    public int reload (int extrabullets ) {
        ammo = ammo + extrabullets;
        if (ammo > 30) {
            ammo = 30;
            System.out.println("Magazine is FULL! (30/30)..!");
        } else {
            System.out.println("magazine is full " + ammo);

        }
        return extrabullets;
    }
    public static void main (String [] args  ){
        Gun ak = new Gun ("Ak-47" ) ;
        ak.shoot(10);
        ak.shoot(10);
       //  System.out.println("Gun is reloading " + reload(230));
        ak.reload(230);
    }
}