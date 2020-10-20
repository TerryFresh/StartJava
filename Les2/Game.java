public class Game {	//отвечает за весь игровой процесс
    private int number1;
    private int number2;
    private int target = (int)Math.floor(Math.random() * 100); //решение гуглом
    private String name1;
    private String name2;

    public void setNumber1(int number1){
        this.number1 = number1;
    }
    public void setNumber2(int number2){
        this.number2 = number2;
    }
    public void setName1(String name1){
        this.name1 = name1;
    }
    public void setName2(String name2){
        this.name2 = name2;
    }
    public void play() {
            do {
                if (number1 < target) {
                    System.out.println(name1 + " указал меньше загадоного значения ");
                }
                if (number1 > target) {
                    System.out.println(name1 + " указал больше загаданого значения ");
                }
                if (number2 < target) {
                    System.out.println(name2 + " указал меньше загадоного значения ");
                }
                if (number2 > target) {
                    System.out.println(name2 + " указал больше загаданого значения ");
                }
            }while(number1 == target | number2 == target);
            if (number1 == target) {
                System.out.println(name1 + " Победитель!!! ");
            }
            if (number2 == target) {
                System.out.println(name2 + " Победитель!!! ");
            }
        }
    }


