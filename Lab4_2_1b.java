public class Lab4_2_1b {
    // Clase Bicicleta
    public static class Bicicleta {
        // Clase Rueda anidada
        public static class Rueda {
            private int diametro;
            private String tipo;
            private String marca;

            // Constructor
            public Rueda(int diametro, String tipo, String marca) {
                this.diametro = diametro;
                this.tipo = tipo;
                this.marca = marca;
            }

            // Getters y setters
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
        }

        // Clase Cuadro anidada
        public static class Cuadro {
            private String material;
            private String color;
            private int tamaño;

            // Constructor
            public Cuadro(String material, String color, int tamaño) {
                this.material = material;
                this.color = color;
                this.tamaño = tamaño;
            }

            // Getters y setters
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
        }

        private Rueda ruedaDelantera;
        private Rueda ruedaTrasera;
        private Cuadro cuadro;

        // Constructor
        public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
            this.ruedaDelantera = ruedaDelantera;
            this.ruedaTrasera = ruedaTrasera;
            this.cuadro = cuadro;
        }

        // Método para usar la bicicleta
        public void usarBicicleta() {
            System.out.println("La bicicleta está en uso.");
        }

        // Getters y setters para la clase Bicicleta
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

    // Método main para probar el programa
    public static void main(String[] args) {
        // Crear las ruedas
        Bicicleta.Rueda ruedaDelantera = new Bicicleta.Rueda(26, "Montaña", "Michelin");
        Bicicleta.Rueda ruedaTrasera = new Bicicleta.Rueda(26, "Montaña", "Michelin");

        // Crear el cuadro
        Bicicleta.Cuadro cuadro = new Bicicleta.Cuadro("Aluminio", "Rojo", 18);

        // Crear la bicicleta
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Usar la bicicleta
        bicicleta.usarBicicleta();

        // Acceder a los atributos de las partes de la bicicleta
        System.out.println("La bicicleta tiene ruedas de marca " + bicicleta.getRuedaDelantera().getMarca() +
                " y cuadro de color " + bicicleta.getCuadro().getColor());
    }
}
