package Pirogova.Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int value = -30;
        String valueType;
        if(value >= 0){
            valueType = "положительное число";}
            else{
            valueType = "отрицательное число";
            }
            int count = 0;
            for(int i = value; i != 0; count++){
                i /= 10;
            }
            switch (count){
                case 1:
                    System.out.println("Однозначное " + valueType);
                    break;
                case 2:
                    System.out.println("Двузначное " + valueType);
                    break;
                case 3:
                    System.out.println("Трехзначное " + valueType);
                    break;
            }
    }
}
