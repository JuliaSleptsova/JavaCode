class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main (String args[]) {
        Box mybox = new Box(12, 12, 12);

        double vol;
        vol = mybox.volume();
        System.out.println(vol);

    }
}
