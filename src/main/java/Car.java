
public class Car {
   private String name;
   private int position=0;

   public Car(String name){
         this.name=name;
   } //자동차 이름 규칙 강제화

    public String getName(){
            return name;
    }

    public int getPosition(){
            return position;
    }

    public void move(){
       position++;
//       System.out.println(position);
    }
}
