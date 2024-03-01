class Gravitacija {
        private float visina;

        Gravitacija(float visina) {
            this.visina = visina;
        }

        public double izracunaj() {
            return (6.67 * Math.pow(10, -11) * 5.89 * Math.pow(10, 24))/Math.pow((6.37 + visina) * Math.pow(10, 6),2);
        }
}