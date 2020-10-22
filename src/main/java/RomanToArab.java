

public enum RomanToArab  {

    I(1),II(2),III(3),IV(4),V(5),VI(6),VII(7),VIII(8),IX(9),X(10), XI(11),
   XIII(13),XIV(14),XV(15),XVI(16),XVII(17),XVIII(18),XIX(19),XX(20), XL(40),
    L(50), LX(60), LXX(70), C(100);

    private int number;


    public int getNumber() {
        return this.number;
    }
    RomanToArab(int number){
        this.number = number;
    }



}
