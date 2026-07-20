public class TestBox {

    public static void main(String[] args) {

        Box3D box = new Box3D(5, 4, 3);

        System.out.println("Area = " + box.area());

        System.out.println("Volume = " + box.volume());
    }

}