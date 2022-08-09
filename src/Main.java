public class Main {
    public static void main(String[] args) {
        //Задание 1
            System.out.println("Задание 1");

    int i = 1;
    while (i<=10){
        System.out.print(i + " ");
    i++;
}
        System.out.println();


    for ( int a = 10; a>=1; a--)
    {
        System.out.print(a + " ");
    }

        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int  firstFriday = 5;

        for (int message = firstFriday; message <= 31; message = message + 7)
        {
            System.out.println("Сегодня пятница, " + message + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3
        System.out.println("Задание 3");

        int aCometIsFlying = 0;
        int year = 2022;
        int yearAgo200 = year - 200;
        int yearAfter100 = year + 100;
        for (; aCometIsFlying<=yearAfter100; aCometIsFlying = aCometIsFlying + 79) {
            if (aCometIsFlying > yearAgo200 && aCometIsFlying < yearAfter100) {

                System.out.println(aCometIsFlying);

            }
        }

        ;
    }
}