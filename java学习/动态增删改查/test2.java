package work;

public class test2 {
    public static void main(String[] args) {
        MyArrays myArray = new MyArrays(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.print();
        myArray.add(2,100);
        myArray.print();
        myArray.remove(3);
        myArray.print();
        myArray.modification(2,3);
        myArray.print();
        myArray.intdexFindtoNumber(2);
        myArray.numberFindtointdex(2);
        myArray.full();
        myArray.print();
    }
}



