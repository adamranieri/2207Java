package dev.ranieri.objectinfo;

public class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override  // some string representation of the object// by default memory address
    public String toString(){
        return  "X: " + this.x + " Y: " + this.y;
    }

    @Override // The developer is responsible for creating some logical comparison
    // with the object passed in and returning true or false
    public boolean equals(Object object){
        if( object instanceof  Point){
            if(this.x == ((Point) object).x && this.y == ((Point) object).y){
                return true;
            }
        }
        return false;
    }

    @Override// A hash is taking the values of the object to generate
    // a number that is unique to the intial values
    public int hashCode(){
        return  (x+999)%7*y*432;
    }


}
