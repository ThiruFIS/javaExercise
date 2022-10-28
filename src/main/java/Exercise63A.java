import javax.print.DocFlavor;

public class Exercise63A {
    String title;
    String author;
}

class Exercise63AA {
    public static void main (String[] args){
        Exercise63A[] mybooks = new Exercise63A[3];

        int x  = 0;
        mybooks[0].title = "test1";
        mybooks[1].title = "test2";
        mybooks[2].title = "test3";

        mybooks[0].author = "test11";
        mybooks[1].author = "test22";
        mybooks[2].author = "test31";

        while(x<3){
            System.out.println(mybooks[x].title);
            x = x + 1;
        }
    }
}