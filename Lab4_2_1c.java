public class Lab4_2_1c {
    public static class Bicicleta {
        public static class Rueda {
            private int diametro;
            private String tipo;
            private String marca;

            public Rueda(int diametro, String tipo, String marca) {
                this.diametro = diametro;
                this.tipo = tipo;
                this.marca = marca;
            }

            public int getDiametro() {
                return diametro;
            }

            public void setDiametro(int diametro) {
                this.diametro = diametro;
            }

            public String getTipo() {
                return tipo;
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public String getMarca() {
                return marca;
            }

            public void setMarca(String marca) {
                this.marca = marca;
            }

            public static Rueda crearRueda() {
                return new Rueda(26, "Montaña", "Michelin");
            }
        }

        public static class Cuadro {
            private String material;
            private String color;
            private int tamaño;

            public Cuadro(String material, String color, int tamaño) {
                this.material = material;
                this.color = color;
                this.tamaño = tamaño;
            }

            public String getMaterial() {
                return material;
            }

            public void setMaterial(String material) {
                this.material = material;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public int getTamaño() {
                return tamaño;
            }

            public void setTamaño(int tamaño) {
                this.tamaño = tamaño;
            }

            public static Cuadro crearCuadro() {
                return new Cuadro("Aluminio", "Rojo", 18);
            }
        }

        private Rueda ruedaDelantera;
        private Rueda ruedaTrasera;
        private Cuadro cuadro;

        public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
            this.ruedaDelantera = ruedaDelantera;
            this.ruedaTrasera = ruedaTrasera;
            this.cuadro = cuadro;
        }

        public void usarBicicleta() {
            System.out.println("La bicicleta está en uso.");
        }

        public Rueda getRuedaDelantera() {
            return ruedaDelantera;
        }

        public void setRuedaDelantera(Rueda ruedaDelantera) {
            this.ruedaDelantera = ruedaDelantera;
        }

        public Rueda getRuedaTrasera() {
            return ruedaTrasera;
        }

        public void setRuedaTrasera(Rueda ruedaTrasera) {
            this.ruedaTrasera = ruedaTrasera;
        }

        public Cuadro getCuadro() {
            return cuadro;
        }

        public void setCuadro(Cuadro cuadro) {
            this.cuadro = cuadro;
        }
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(Bicicleta.Rueda.crearRueda(), Bicicleta.Rueda.crearRueda(), Bicicleta.Cuadro.crearCuadro());

        bicicleta.usarBicicleta();

        System.out.println("La bicicleta tiene ruedas de marca " + bicicleta.getRuedaDelantera().getMarca() +
                " y cuadro de color " + bicicleta.getCuadro().getColor());
    }
}

