class Rectangle {
    int Height;
    int Width;

    Rectangle(int Height, int Width){
        this.Height = Height;
        this.Width = Width;
    }

    public void getRectangle(){
        int Area = Height * Width;
        System.out.println("Area : "+Area);
    }
}

public class EncapsulationPretice {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 3);
        r.getRectangle();
    }
}
