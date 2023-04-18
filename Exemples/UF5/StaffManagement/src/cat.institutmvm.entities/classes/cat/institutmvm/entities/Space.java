package cat.institutmvm.entities;

public class Space<T> {
   //<editor-fold defaultstate="collapsed" desc="Atributs/Estat">
    private T minX, maxX, minY, maxY;
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes (Comportament)">
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Space(T minX, T maxX, T minY, T maxY) {
       this.setMinX(minX);
       this.setMaxX(maxX);
       this.setMinY(minY);
       this.setMaxY(maxY);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getMinX() {
        return minX;
    }

    public void setMinX(T minX) {
        this.minX = minX;
    }

    public T getMaxX() {
        return maxX;
    }

    public void setMaxX(T maxX) {
        this.maxX = maxX;
    }

    public T getMinY() {
        return minY;
    }

    public void setMinY(T minY) {
        this.minY = minY;
    }

    public T getMaxY() {
        return maxY;
    }

    public void setMaxY(T maxY) {
        this.maxY = maxY;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Overrides: Sobreescriptura de mètodes">
    @Override
    public String toString() {
        return "Space{" + "minX=" + minX + ", maxX=" + maxX + ", minY=" + minY + ", maxY=" + maxY + '}';
    }
    //</editor-fold>
    //</editor-fold>    
}

