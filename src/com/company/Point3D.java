package com.company;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(){
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                "y=" + super.getY() +
                "z=" + z +
                '}';
    }
}
