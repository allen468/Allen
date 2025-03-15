import java.util.Random;
public class Red{
    public static void main(String[] args){
        String[] balls = {"Red","Blue","Green","Yellow","Orange","Purple"};
        Random random=new Random();
        int randomIndex = random.nextInt(balls.length);
        String pickedBall = balls[randomIndex];
        System.out.println("the picked ball is:" + pickedBall);
    }
}
