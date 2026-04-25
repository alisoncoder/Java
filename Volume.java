class Shape {
  public double getVolume() {
    return 0;
  }
}


class Cuboid extends Shape {
  private double length;
  private double width;
  private double height;
  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;  
  }
  public double getVolume() {
    return length * width * height;
  }
}
class Volume {
  public static void main(String args[]) {
    Shape[] shape = new Shape[2];
    shape[0] = new Cuboid(5, 4, 3);


    System.out.println("Volume of the Cuboid: " + shape[0].getVolume());
  }
}
