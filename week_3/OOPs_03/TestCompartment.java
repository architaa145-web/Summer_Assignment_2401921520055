import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] coach = new Compartment[10];

        Random random = new Random();

        for (int i = 0; i < coach.length; i++) {

            int choice = random.nextInt(4) + 1;

            switch (choice) {

                case 1:
                    coach[i] = new FirstClass();
                    break;

                case 2:
                    coach[i] = new Ladies();
                    break;

                case 3:
                    coach[i] = new General();
                    break;

                case 4:
                    coach[i] = new Luggage();
                    break;
            }

            System.out.println("Coach " + (i + 1) + " : " + coach[i].notice());
        }
    }

}