public class Winner {
    public void findWinner(Car[] cars){
        int maxPosition =0;
        for(int i=0;i<cars.length;i++){
            if(cars[i].getPosition() > maxPosition){
                maxPosition = cars[i].getPosition();
            }
        }

        System.out.print("우승자: ");

        for(int i=0;i<cars.length;i++){
            if(cars[i].getPosition() == maxPosition){
                System.out.println(cars[i].getName() + " ");
            }
        }
    }
}
