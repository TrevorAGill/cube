/**
 * Created by Guest on 8/10/17.
 */
public class Cube {
    private Rectangle face;

    public Cube(Rectangle rectangle){
        setFace(rectangle);
    }
    public Rectangle getFace(){
        return face;
    }

    public int getVolume(){
        int height = getFace().getHeight();
        return height * height * height;
    }

    public int getSurfaceArea(){
        int height = getFace().getHeight();
        return face.area() * 6;
    }

    public void setFace(Rectangle face) {
        this.face = face;
    }
}
