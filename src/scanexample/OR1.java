package scanexample;
class OR1 {

    public void smartPhone() {
        System.out.println(" This is smartphone is unlock using the Pincode");

    }
}
class Phone extends OR1 {
    @Override
    public void smartPhone (){
        System.out.println("the new mobile device has feature of the face unlock ");
    }
}
class My {
    public static void main (String []  raje){

        Phone obj = new Phone();

        obj.smartPhone();
    }
}