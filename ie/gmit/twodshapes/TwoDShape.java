package ie.gmit.twodshapes;

public class TwoDShape {
    
    // Instance Variables
    private float widthCm;
    private float heightCm;

    //constructer
    public TwoDShape(float widthCm, float heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }


    //getter
    public float getWidthCm(){
        return this.widthCm;
    }

    //setter
    public void setWidthCm(float widthCm){
        this.widthCm = widthCm;
    }

    public float getHeightCm(){
        return this.heightCm;
    }

    public void setHeightCm(float heightCm){
        this.heightCm = heightCm;
    }

}
