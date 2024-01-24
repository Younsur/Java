import java.util.Arrays;

public class ShapeSequence {
    private Shape[] shapes;
    private int shapesTop = 0;
    ShapeSequence(int size) {
        if (size < 0){
            size = 0;
        }
        Shape[] shapes = new Shape[size];
        setShapes(shapes);
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapesTop(int shapesTop) {
        this.shapesTop = shapesTop;
    }

    public int getShapesTop() {
        return shapesTop;
    }

    public void add(Shape shape) {
        if (getShapesTop() <= shapes.length - 1) {
            getShapes()[getShapesTop()] = shape;
            setShapesTop(getShapesTop() + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < shapes.length; i++) {
            switch (shapes[i].getClass().getName()) {
                case "Rectangle" -> string.append("rectangle");
                case "Rhombus" -> string.append("rhombus");
                case "Ellipse" -> string.append("ellipse");
            }

            if (i != shapes.length - 1) {
                string.append(",");
            }
        }
        string.append("]");
        return string.toString();
    }

    public SequenceIterator iterator() {
        return new SequenceIterator();
    }
    private class SequenceIterator {
        int cnt;
        public SequenceIterator() {
            cnt = 0;
        }
        public boolean isEnd() {
            if (cnt >= getShapes().length) {
                return true;
            }
            return false;
        }
        public Shape current() throws Exception {
            if (isEnd()) {
                throw new Exception("illegal");
            }
            return getShapes()[cnt];
        }
        public void moveNext() {
            if (!isEnd()) {
                cnt++;
            }
        }
        public ShapeSequence getSequence() {
            return ShapeSequence.this;
        }
        public boolean equals(Object o) {
            if (o instanceof SequenceIterator && ((SequenceIterator)o).getSequence().equals(ShapeSequence.this) && ((SequenceIterator) o).cnt == 0) {
                return true;
            }
            return false;
        }
    }

    public void print() throws Exception {
        SequenceIterator sequenceIterator = iterator();
        while (!sequenceIterator.isEnd()) {
            System.out.println(sequenceIterator.current().getClass().getName());
            sequenceIterator.moveNext();
        }
        System.out.println(sequenceIterator.cnt);
        sequenceIterator.moveNext();
        System.out.println(sequenceIterator.cnt);
        if (sequenceIterator.equals(ShapeSequence.this.iterator())) {
            System.out.println("TRUE");
        }
        if (!sequenceIterator.equals(ShapeSequence.this.iterator())) {
            System.out.println("False");
        }
    }
}
