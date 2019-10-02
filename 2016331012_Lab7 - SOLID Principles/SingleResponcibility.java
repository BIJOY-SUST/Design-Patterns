import java.util.*;

class _variable{
    String dT,name,value;

    _variable(String dT, String name, String value){
        this.dT = dT;
        this.name = name;
        this.value = value;
    }

}

interface Outputable{
    public ArrayList<_variable> get_info();
}



class Book implements Outputable{
    String name;
    String author;
    Integer numpage;

    Book(){}
    Book(String name, String author, int numpage){
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    void show(){
        System.out.println("name: " + name);
        System.out.println("author: " + author);
        System.out.println("num page: " + numpage);
    }

    public ArrayList<_variable>get_info(){
        ArrayList<_variable>info = new ArrayList<>();
        info.add(new _variable("String","name",name));
        info.add(new _variable("String","author",author));
        info.add(new _variable("String","numpage",numpage.toString()));
        return info;
    }

}


class Outputter{
    Outputable obj;
    void showJSON(){
        ArrayList<_variable>info =  obj.get_info();
    }

    void setObject(Outputable obj){
        this.obj = obj;
    }
}

class Movie implements Outputable{
    String name;
    Integer runtime;
    String director;
    Double imdb_rating;

    Movie(){}
    Movie(String name, String director, int runtime, double imdb_rating){
        this.name = name;
        this.runtime = runtime;
        this.director = director;
        this.imdb_rating = imdb_rating;
    }

    void show(){
        System.out.println("name: " + name);
        System.out.println("director: " + director);
        System.out.println("runtime: " + runtime);
        System.out.println("imdb_rating: " + imdb_rating);
    }

    public ArrayList<_variable>get_info(){
        ArrayList<_variable>info = new ArrayList<>();
        info.add(new _variable("String","name",name));
        info.add(new _variable("String","runtime",runtime.toString()));
        info.add(new _variable("String","director",director));
        info.add(new _variable("String", "imdb_rating", imdb_rating.toString()));
        return info;
    }
}

class SingleResponcibility{
    
    public static void main(String[] args){
        Book book = new Book(
            "Harry Potter and the Deathly Hallows",
            "JK Rowling",
            546
        );

        Movie movie = new Movie(
            "Inception",
            "Christopher Nolan",
            96,
            8.5
        );

        Outputter out_book = new Outputter();
        out_book.setObject(book);
        out_book.showJSON();
        book.show();


        Outputter out_movie = new Outputter();
        out_movie.setObject(movie); 
        out_movie.showJSON();
        movie.show();


    }
}