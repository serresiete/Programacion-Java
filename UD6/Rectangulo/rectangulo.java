package Rectangulo;

public class rectangulo {
        //Atributos estaticos
        private int x1;
        private int y1;
        private int x2;
        private int y2;
    
        //Constructores
        public rectangulo() {}

        //Setters y getters
        public void setCoordenadas1(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        public int getx1() {
            return x1;
        }
        public int getx2() {
            return x2;
        }
        public int getY1() {
            return y1;
        }
        public int getY2() {
            return y2;
        }

        //Metodos
        public int perimetro(int base, int altura){
            int perimetro = (base*2) + (altura*2);
            return perimetro;
        }
        public int area(int base, int altura){
            int area = base*altura;
           return area;
        }
}
