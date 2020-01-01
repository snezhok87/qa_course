package mypractice.guessthenumber;

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10); // создаем число, которые игроки должны угадать
        System.out.println(" Я думаю, что это число - " + number);
    }
}
